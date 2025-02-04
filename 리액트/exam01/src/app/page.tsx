'use client'
// import Counter from '@/components/Counter'
import Greeting from '@/components/Greeting'
import Greeting2 from '@/components/Greeting'
// import { sum, subtract} from '@/components/Greeting'
import { sum as add, subtract } from '@/components/Greeting'

//console.log(sum(10, 20), subtract(10, 5))
console.log(add(50, 40), subtract(50, 40))

export default function MainPage() {
  // return <Counter />
  return (
    <>
      <Greeting />
      <Greeting2 />
    </>
  )
}
