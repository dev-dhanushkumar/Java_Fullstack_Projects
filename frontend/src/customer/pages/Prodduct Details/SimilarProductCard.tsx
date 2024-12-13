import { Favorite, ModeComment } from '@mui/icons-material';
import { Button } from '@mui/material';
import { teal } from '@mui/material/colors';
import React, { useEffect, useState } from 'react'


const SimilarProductCard = () => {


    return (
        <>
            <div className='group px-4 relative'>
                <div className='card'>
                    <img className='card-media object-top'src="https://rukminim2.flixcart.com/image/612/612/xif0q/t-shirt/e/j/l/l-hlts004388-highlander-original-imahyycwswypuah2.jpeg?q=70" alt="" />
                </div>

                <div className='details pt-3 space-y-1 group-hover-effect rounded-md'>
                    <div className='name'>
                        <h1>HIGHLANDER</h1>
                        <p>Men Printed Round Neck Cotton Blend Blue T-Shirt</p>
                    </div>

                    <div className='flex items-center gap-3'>
                        <span className='font-semibold text-gray-800'>
                            ₹ 498
                        </span>
                        <span className='thin-line-through text-gray-400'>
                            ₹ 1649
                        </span>
                        <span className='text-primary-color font-semibold'>
                            69%
                        </span>
                    </div>

                </div>

            </div>
        </>
    )
}

export default SimilarProductCard