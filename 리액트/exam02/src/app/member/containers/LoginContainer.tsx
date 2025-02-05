'use client'

import React, {useState, useCallback} from 'react'
import LoginForm from '../components/LoginForm'
import styled from 'styled-components'
import { processLogin } from '../services/actions'

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
