import React from 'react'
import ReviewCard from './ReviewCard'
import { Divider } from '@mui/material'

const Review = () => {
  return (
    <div className='p-5 lg:px-20 flex flex-col lg:flex-row gap-20'>
      <section className='w-full md:w-1/2 lg:w-[30%] space-y-2'>
        <img src="https://rukminim1.flixcart.com/image/1760/1760/xif0q/sweatshirt/j/t/r/-original-imah4h4m8gcrb8zy.jpeg?q=90&crop=false" alt="" />

        <div>
          <div>
            <p className='font-bold text-xl'>Raja Silks Center</p>
            <p className='text-lg text-gray-600'>Men's Sleeve Solid Hooded Sweatshirt</p>
          </div>
          <div>
            <div className='flex items-center gap-3 mt-5 text-2xl'>
              <span className='font-semibold text-gray-800'>
                ₹ 498
              </span>
              <span className='line-through text-gray-400'>
                ₹ 1649
              </span>
              <span className='text-primary-color font-semibold'>
                69% off
              </span>
            </div>
            </div>
          </div>
      </section>

      <section className='space-y-5 w-full'>
        {[1,1,1,1,11,1].map((item) =><div className='space-y-3'><ReviewCard />
        <Divider />
        </div> )}
      </section>
    </div>
  )
}

export default Review