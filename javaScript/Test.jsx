import React from 'react'

const Test = () => {
  const sayHello = () => {
    console.log("Hahahhaaha I DID IT, but not saying HELLO AHAHA");
  }
  return (
    <>
    <button onClick={sayHello}>Click me</button>
    </>
  )
}

export default Test