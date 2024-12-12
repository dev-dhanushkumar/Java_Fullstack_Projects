import React from 'react'
import './ShopByCategory.css';

const ShopByCategoryCard = () => {
  return (
    <div className='flex gap-3 flex-col justify-center items-center group cursor-pointer'>
        <div className='custom-border  w-[150px] h-[150px] lg:w-[210px] lg:h-[210px] rounded-full bg-primary-color'>
            <img className='rounded-full group-hover:scale-95 transition-transform transform-duration-400 object-cover object-top h-full w-full'
             src="https://assets.myntassets.com/dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2024/OCTOBER/16/vfLtwsFn_f6a3ae562af649bc894e14b2f686ffcd.jpg" alt=""  />
        </div>
        <h1>Kitchen and Table</h1>
    </div>
  )
}

export default ShopByCategoryCard