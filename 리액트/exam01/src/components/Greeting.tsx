//import '../styles/greeting.css'
import '../styles/greeting.css'

const Greeting = () => {
  const name = '이이름'
  const date = new Date()
  const visible = true

  /*   const style = {
    backgroundColor: 'skyblue',
    color: 'orange',
  } */

  return (
    <>
      <h1 // 한 줄 주석 / 주석 이후에는 줄을 바꿔주어야함
        className="title"
      >
        {name}님 반갑습니다
      </h1>
      {/* <h1 style={{backgroundColor: 'skyblue', color: 'blue'}}>{name}님 반갑습니다.</h1> */}
      {/* visible ? <h2>현재 시간 : {date.toLocaleString()}</h2> : '' */}
      {visible && <h2>현재 시간 : {date.toLocaleString()}</h2>}
    </>
  )
}

export const sum = (a: number, b: number): number => a + b
export const subtract = (a: number, b: number): number => a - b

export default Greeting
