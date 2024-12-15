import { Delete } from '@mui/icons-material'
import { Avatar, Box, Grid2, IconButton, Rating } from '@mui/material'
import { red } from '@mui/material/colors'
import React from 'react'

const ReviewCard = () => {
  return (
    <div className='flex justify-between'>
      <Grid2 container spacing={1} gap={6}>
        <Grid2 size={{ xs:1}}>
          <Box>
            <Avatar className='text-white' sx={{width:56, height:56, bgcolor:"#9155FD"}}>
              A
            </Avatar>
          </Box>
        </Grid2>

        <Grid2 size={{ xs: 9}}>
          <div className='space-y-2'>
            <div>
              <p className='font-semibold text-lg'>Auss</p>
              <p className='opacity-70'>2024-12-12:16:07:478333</p>
              
            </div>
          </div>
          <Rating 
          readOnly
          value={4.5}
          precision={.5}
          />
          <p className=''>value for money product, great product</p>
          <div>
            <img className='w-24 h-24 object-cover ' src="data:image/jpeg;base64,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" alt="" />
          </div>
        </Grid2>
      </Grid2>
      <div>
        <IconButton>
          <Delete sx={{color:red[700]}} />
        </IconButton>
      </div>
    </div>
  )
}

export default ReviewCard