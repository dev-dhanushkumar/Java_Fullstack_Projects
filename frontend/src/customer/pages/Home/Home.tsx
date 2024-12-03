import React from 'react'
import ElectricCategory from '../../components/ElectricCategory/ElectricCategory'
import CategoryGrid from '../../components/CategoryGrid/CategoryGrid'
import Deal from '../../components/Deal/Deal'

const Home = () => {
  return (
    <>
    <div className='space-y-5 lg:space-y-10 relative pb-20'>
        <ElectricCategory />
        <CategoryGrid />
        <Deal />
    </div>
    </>
  )
}

export default Home