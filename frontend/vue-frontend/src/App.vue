<template>
  <!-- <img alt="Vue logo" src="./assets/logo.png"> -->
  <!-- <HelloWorld msg="Welcome to Your Vue.js App"/> -->
  <Student_Details/>
</template>

<script>
// import Student_DetailsVue from './components/Student_Details.vue'
// import HelloWorld from './components/HelloWorld.vue'
import Student_Details from './components/Student_Details.vue';

export default {
  name: 'App',
  components: {
    // HelloWorld
    Student_Details
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
