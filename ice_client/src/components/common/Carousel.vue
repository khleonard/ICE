<template>
  <div class="block">
    <el-carousel height="300px" indicator-position="outside">
      <el-carousel-item v-for="item in carouselImgUrl" :key="item">
        <img :src="item" height="100%" width="100%" alt/>
      </el-carousel-item>
    </el-carousel>
  </div>
</template>

<script>
export default {
  name: 'Carousel',
  props: ['carouselImgUrl']
}
</script>

<style scoped>
  .el-carousel__item h3 {
    color: #475669;
    font-size: 14px;
    opacity: 0.75;
    line-height: 150px;
    margin: 0;
  }

  .el-carousel__item:nth-child(2n) {
    background-color: #99a9bf;
  }

  .el-carousel__item:nth-child(2n+1) {
    background-color: #d3dce6;
  }
</style>
