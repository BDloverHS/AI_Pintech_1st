'use client'
// 지연로딩을 사용하여 사용자가 필요로 할 때만 로딩이 될 수 있도록 구현

import React, { Suspense, useState } from 'react'
// import Message from './Message'
const Message = React.lazy(() => import('./Message'))

const Exam06Page = () => {
  const [visible, setVisible] = useState<boolean>(false)

  const handleClick = () => setVisible(true)

  return (
    <>
      <button type="button" onClick={handleClick}>
        클릭
      </button>
      {/* fallback : 인터넷이 느리거나 할 때 로딩 중 기본적으로 띄울 페이지 */}
      <Suspense fallback={<div>로딩중...</div>}>
        {visible && <Message />}
      </Suspense>
    </>
  )
}

export default Exam06Page
