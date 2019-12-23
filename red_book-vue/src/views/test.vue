<template>
	<div>
		<p> {{ msg }}</p>
	</div>
</template>

<script>
	
export default {
	data(){
		return{
			msg: '123',
			
		}
	},
	created() {
		this.axios.get("http://94.191.10.75:8080/test").then((response) => {
		  this.msg = response.data;
		  console.log(response.data)
		})
	}
}
</script>

<style>
</style>
