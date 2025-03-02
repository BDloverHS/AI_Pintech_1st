'use client'

import { ColorContext } from './page'

const Component3 = () => {
  return (
    <>
      <h1>Component3</h1>
      <ColorContext.Consumer>
        {(value) => 
          <div style={{ background: value.color, width:'300px', height: '300px' }}></div>
        }
      </ColorContext.Consumer>
    </>
  )
}

export default Component3
