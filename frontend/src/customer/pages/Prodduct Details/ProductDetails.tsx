import React, { useState } from 'react'
import StarIcon from '@mui/icons-material/Star';
import { teal } from '@mui/material/colors';
import { Button, Divider } from '@mui/material';
import { Add, AddShoppingCart, FavoriteBorderOutlined, LocalShipping, Remove, Shield, Wallet, WorkspacePremium } from '@mui/icons-material';
import SimilarProduct from './SimilarProduct';

const ProductDetails = () => {
  const [quantity, setQuantity] = useState(1);
  return (
    <div className='px-5 lg:px-20 pt-10'>
      <div className='grid grid-cols-1 lg:grid-cols-2 gap-10 '>
        <section className='flex flex-col lg:flex-row gap-5'>
          <div className='w-full lg:w-[15%] flex flex-wrap lg:flex-col gap-3'>
            {[1,1,1,1].map((item) => <img
            className='lg:w-full w-[50px] cursor-pointer rounded-md' 
            src='https://rukminim1.flixcart.com/image/1760/1760/xif0q/sweatshirt/j/t/r/-original-imah4h4m8gcrb8zy.jpeg?q=90&crop=false' 
            alt=''
            />)}
          </div>
          <div className=' w-full lg:w-[85%] '>
            <img className='w-full rounded-md' src="https://rukminim1.flixcart.com/image/1760/1760/xif0q/sweatshirt/j/t/r/-original-imah4h4m8gcrb8zy.jpeg?q=90&crop=false" alt="" />
          </div>
        </section>


        <section>
        <h1 className='font-bold text-lg text-primary-color'>PUMA</h1>
        <p className='text-gray-500 font-semibold'>Men & Women Full Sleeve Solid Hooded Sweatshirt</p>
        <div className='flex justify-between items-center py-2 border w-[180px] px-3 mt-5'>
          <div className='flex gap-1 items-center '>
            <span>4</span>
            <StarIcon sx={{color:teal[500], fontSize:"17px"}}/>
          </div>
          <Divider orientation='vertical' flexItem />
          <span>
            564 Ratings 
          </span>
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
        <p className='text-sm mt-3'>Inclusive of all taxes. Free Shipping above ₹530.</p>
        </div>
        <div className='mt-7 space-y-3'>
          <div className='flex items-center gap-3'>
            <Shield sx={{color:teal[500]}}/>
            <p>Authentic & Quality Assured</p>
          </div>
    
          <div className='flex items-center gap-3'>
            <WorkspacePremium sx={{color:teal[500]}}/>
            <p>100% money back guarantee</p>
          </div>
    
          <div className='flex items-center gap-3'>
            <LocalShipping sx={{color:teal[500]}}/>
            <p>Free Shipping & Returns</p>
          </div>
    
          <div className='flex items-center gap-3'>
            <Wallet sx={{color:teal[500]}}/>
            <p>Pay on delivery might be available</p>
          </div>
        </div>

        <div className='mt-7 space-y-2'>
            <h1>QUANTITY</h1>
            <div className='flex items-center gap-2 w-[104px] justify-between'>
              <Button disabled={quantity === 1} onClick={() => setQuantity(quantity -1)}>
                <Remove/>
              </Button>
              <span>
                {quantity}
              </span>
              <Button onClick={() => setQuantity(quantity + 1)}>
                <Add/>
              </Button>
            </div>
        </div>

        <div className='mt-12 flex items-center gap-5'>
          <Button 
          fullWidth
          variant='contained'
          startIcon={<AddShoppingCart/>}
          sx={{py:"1rem"}}>
            Add to Bag
          </Button>

          <Button 
          fullWidth
          variant='outlined'
          startIcon={<FavoriteBorderOutlined/>}
          sx={{py:"1rem"}}>
            Whishlist
          </Button>
        </div>

        <div className='mt-5 py-3'>
          <p>Refresh your clothing collection with the wide collection of Sweatshirts from HOLDIT. 
          This Sweatshirt is made of Fleece fabric and provides utmost comfort during normal and low 
          temperatures. This Sweatshirt is Regular Fit with superior quality fabric and stitching.
          </p>
        </div>
      </section>
      </div>
      <div className='mt-20'>
        <h1 className='text-lg font-bold'> Similar Product</h1>
        <div className='pt-5'>
          <SimilarProduct />
        </div>
      </div>
    </div>
  )
}

export default ProductDetails