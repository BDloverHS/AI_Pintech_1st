'use client'

import React, { useState, useMemo, useCallback } from 'react'

function getTotal(numbers: number[]) {
  console.log('호출!')
  return numbers && numbers.length > 0 ? numbers.reduce((a, b) => a + b) : 0
}

const Exam03Page = () => {
  const [numbers, setNumbers] = useState<number[]>([])
  const [number, setNumber] = useState<number | undefined>()

  const handleChange = useCallback((e) => setNumber(e.target.value), [])
  const handleClick = useCallback(() => {
    if (number && !isNaN(number)) {
      setNumbers((numbers) => numbers.concat(Number(number)))
    }
  }, [number])

  const total = useMemo(() => getTotal(numbers), [numbers])

  return (
    <>
      <input type="number" onChange={handleChange} />
      <button type="button" onClick={handleClick}>
        더하기
      </button>
      <ul>
        {numbers.map((num, i) => (
          <li key={num + '_' + i}>{num}</li>
        ))}
      </ul>
      <div>합계 : {total}</div>
    </>
  )
}

export default Exam03Page
