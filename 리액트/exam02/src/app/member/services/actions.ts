'use server'

import { redirect } from 'next/navigation'
import { cookies } from 'next/headers'

export const processJoin = async (formState, formData: FormData) => {
  /**
   * 1) 필수 항목 검증
   * 2) 비밀번호와 비밀번호 확인 일치 여부
   * 3) 서버쪽에 처리 요청
   * 4) 후속 처리 -> 로그인 페이지 이동
   */
  let errors = {}

  // 1) 필수 항목 검증 S
  const requiredFields = {
    email: '이메일을 입력하세요.',
    password: '비밀번호를 입력하세요.',
    confirmPassword: '비밀번호를 확인하세요.',
    name: '회원명을 입력하세요.',
  }
  for (const [field, msg] of Object.entries(requiredFields)) {
    const value = formData.get(field)
    if (!value || !value?.trim()) {
      errors[field] = errors[field] ?? []
      errors[field].push(msg)
    }
  }
  // 1) 필수 항목 검증 E

  // 2) 비밀번호와 비밀번호 확인 일치 여부 S
  const password = formData.get('password')
  const confirmPassword = formData.get('confirmPassword')
  if (
    password &&
    password?.trim() &&
    confirmPassword &&
    confirmPassword?.trim() &&
    password !== confirmPassword
  ) {
    errors.confirmPassword = errors.confirmPassword ?? []
    errors.confirmPassword.push('비밀번호가 일치하지 않습니다.')
  }
  // 2) 비밀번호와 비밀번호 확인 일치 여부 E

  // 3) 서버쪽에 처리 요청 S
  const form = {}
  for (const [key, value] of formData.entries()) {
    if (['email', 'password', 'confirmPassword', 'name'].includes(key)) {
      form[key] = value
    }
  }

  form.requiredTerms1 = true
  form.requiredTerms2 = true
  form.requiredTerms3 = true
  console.log('form', form)
  try {
    const res = await fetch('https://member-service.koreait.xyz/join', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(form),
    })
    if (res.status !== 201) {
      // 처리 실패 -> 에러 출력
      const result = await res.json()
      if (!result.success) {
        errors = result.message
      }
    } else {
      //  회원가입 성공시에는 로그인 페이지로 이동
      redirect('/member/login')
    }
  } catch (err) {
    console.error(err)
  }
  // 3) 서버쪽에 처리 요청 E

  return errors
}

/**
 * 로그인 처리 담당
 *
 * @param form
 * @param formData
 */
export const processLogin = async (form, formData: FormData) => {
  /**
   * 1) 필수 항목 검증
   * 2) 서버 요청
   * 3) 실패 시 에러 메시지 출력
   * 4) 성공 시 지정된 주소 또는 메인으로 이동
   *
   */

  const errors = {}
  let hasErrors = false

  // 1) 필수 항목 검증 S
  const email = formData.get('email')
  const password = formData.get('password')

  if (!email || !email.trim()) {
    errors.email = errors?.email ?? []
    errors.email.push('이메일을 입력하세요.')
    hasErrors = true
  }

  if (!password || !password.trim()) {
    errors.password = errors?.password ?? []
    errors.password.push('비밀번호를 입력하세요.')
    hasErrors = true
  }

  if (hasErrors) {
    return errors
  }
  // 1) 필수 항목 검증 E

  // 2) 서버 요청 S
  const apiUrl = process.env.API_URL + '/member-service'
  try {
    const res = await fetch(apiUrl, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({ email, password }),
    })
    const result = await res.json()
    if (result.success) {
      // 성공 시
      const cookie = await cookies()
      cookie.set('token', result.data, {
        httpOnly: true,
        sameSite: 'none',
        secure: true,
        path: '/',
      })
      console.log(result)
    } else {
      // 실패 시
      return result.message
    }
    console.log('result', result)
  } catch (err) {
    console.error(err)
  }

  // 2) 서버 요청 E

  redirect('/')

  // 3) 실패 시 에러 메시지 출력 S

  // 3) 실패 시 에러 메시지 출력 E

  // 4) 성공 시 지정된 주소 또는 메인으로 이동 S

  // 4) 성공 시 지정된 주소 또는 메인으로 이동 E
}

/**
 * 로그인한 사용자 정보 조회
 *
 *  - token 쿠키를 가지고 서버에 요청
 */
export const getUserInfo = async () => {
  const cookie = await cookies()
  const token = cookie.get('token')
  if (!token || !token.value) return

  try {
    const apiUrl = process.env.API_URL + '/member-service'
    const res = await fetch(apiUrl, {
      method: 'GET',
      headers: {
        Authorization: `Bearer ${token.value}`,
      },
    })

    if (res.status === 200) {
      const result = await res.json()
      return result.data
    }
  } catch (err) {
    console.error(err)
  }
}
