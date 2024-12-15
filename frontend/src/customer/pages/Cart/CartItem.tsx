import { Add, Close, Remove } from '@mui/icons-material'
import { Button, Divider, IconButton } from '@mui/material'
import React, { useState } from 'react'

const CartItem = () => {
    //   const [quantity, setQuantity] = useState(1);
    const handleUpdateQuantity = () => {

    }
    return (
        <div className='border rounded-md relative'>
            <div className='p-5 flex gap-3'>
                <div>
                    <img className='w-[90px] rounded-md ' src="https://rukminim2.flixcart.com/image/612/612/xif0q/t-shirt/e/j/l/l-hlts004388-highlander-original-imahyycwswypuah2.jpeg?q=70" alt="" />
                </div>
                <div className='space-y-2'>
                    <h1 className="font-semibold text-lg">Raja Silks Center</h1>
                    <p className='text-gray-600 font-medium text-sm'>Men's Sleeve Solid Hooded Sweatshirt</p>
                    <p className='text-gray-400 text-xs'><strong>Sold by:</strong>PUMA Products Private Limited.</p>
                    <p className='text-sm'>7 Days replacement available</p>
                    <p className='text-sm text-gray-500'><strong>quantity :</strong>5</p>
                </div>
            </div>
            <Divider />
            <div className='flex justify-between items-center'>
            <div className='px-5 py-2 flex justify-between items-center'>
                <div className='flex items-center gap-2 w-[150px] justify-between'>
                    <Button disabled={true} onClick={handleUpdateQuantity}>
                        <Remove />
                    </Button>
                    <span>
                        {5}
                    </span>
                    <Button onClick={handleUpdateQuantity}>
                        <Add />
                    </Button>
                </div>
            </div>
            <div className='pr-5'>
                <p className='text-gray-700 font-medium'>₹799</p>
            </div>
            </div>
            <div className='absolute top-1 right-1'>
                <IconButton color='primary'>
                    <Close />
                </IconButton>
            </div>
        </div>
    )
}

export default CartItem