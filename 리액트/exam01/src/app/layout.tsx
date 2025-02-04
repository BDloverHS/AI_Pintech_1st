import type {Metadata} from 'next';

export const metadata: Metadata = {
  title: 'Next.js 연습',
  description: '설명...',
}

type ProType = {
  children: React.ReactNode
}

export default function MainLayOut({ children }:Readonly<ProType>) {
  return (
    <html>
      <head></head>

      <body>
        <h1>메인 레이아웃</h1>
        {children}
      </body>
    </html>
  )
}