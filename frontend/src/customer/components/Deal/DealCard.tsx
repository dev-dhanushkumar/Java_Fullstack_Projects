import React from 'react'

const DealCard = () => {
  return (
    <div className='w-[10rem] cursor-pointer'>
        <img className='border-x-[5px] border-t-[5px] border-pink-600 w-full h-[12rem] object-cover object-top' src="https://rukminim2.flixcart.com/image/612/612/xif0q/smartwatch/v/8/r/-original-imagy97z4qgjheyn.jpeg?q=70" alt=""  />
        <div className='border-4 border-black bg-black text-white p-2 text-center'>
            <p className='text-lg font-semibold'>Smart Watch</p>
            <p className='text-2xl font-bold'>20% OFF</p>
            <p className='text-balance text-lg'>shop now</p>
        </div>
    </div>
  )
}

export default DealCard