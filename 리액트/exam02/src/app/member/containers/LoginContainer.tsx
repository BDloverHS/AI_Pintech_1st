'use client'

import LoginForm from '../components/LoginForm'

import { useState, useActionState } from 'react'
import { processLogin } from '../services/actions'

type FormType = {
  email?: string
  password?: string
}

const LoginContainer = () => {
  const [form, setForm] = useState<FormType>({})
  const actionState = useActionState(processLogin, form)

  const handleChange = (e) => {
    setForm((form) => ({ ...form, [e.target.name]: e.target.value }))
  }

  return (
    <LoginForm actionState={actionState} onChange={handleChange} form={form} />
  )
}

export default LoginContainer
