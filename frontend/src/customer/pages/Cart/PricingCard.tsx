import { Divider } from '@mui/material'
import React from 'react'

const PricingCard = () => {
  return (
    <>
    <div className='space-y-3 p-5'>
      <div className='flex justify-between items-center'>
        <span className='text-gray-600'>Subtotal</span>
        <span>₹1399</span>
      </div>

      <div className='flex justify-between items-center'>
        <span className='text-gray-600'>Discount</span>
        <span>₹600</span>
      </div>

      <div className='flex justify-between items-center'>
        <span className='text-gray-600'>Shipping</span>
        <span>₹79</span>
      </div>

      <div className='flex justify-between items-center'>
        <span className='text-gray-600'>Platform fee</span>
        <span className='text-primary-color'>Free</span>
      </div>

    </div>
    <Divider />

    <div className='flex justify-between items-center p-5'>
      <span className='font-semibold'>Total</span>
      <span className='font-semibold'>₹799</span>
    </div>
    </>
  )
}

export default PricingCard