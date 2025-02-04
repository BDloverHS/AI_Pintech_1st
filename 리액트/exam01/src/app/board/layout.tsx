type ProType = {
  children: React.ReactNode
}

export default function BoardLayout({ children }: Readonly<ProType>) {
  return (
    <div>
      <h2>게시판 상단</h2>
      {children}
      <h2>게시판 하단</h2>
    </div>
  )
}
