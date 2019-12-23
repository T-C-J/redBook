<template>
  <div id="app">
    <div id="nav">
		<mt-header fixed title="固定在顶部"></mt-header>
      <!-- <router-link to="/">Home</router-link> |
      <router-link to="/about">About</router-link> -->
    </div>
    <router-view/>
	
	<nav class="mui-bar mui-bar-tab">
		<router-link class="mui-tab-item" to="/test">
			<span class="mui-icon mui-icon-home"></span>
			<span class="mui-tab-label">首页</span>
		</router-link>
		<router-link class="mui-tab-item" to="/tabbar-with-chat">
			<span class="mui-icon mui-icon-email"><span class="mui-badge">9</span></span>
			<span class="mui-tab-label">消息</span>
		</router-link>
		<router-link class="mui-tab-item" to="/tabbar-with-contact">
			<span class="mui-icon mui-icon-contact"></span>
			<span class="mui-tab-label">通讯录</span>
		</router-link>
		<router-link class="mui-tab-item" to="/tabbar-with-map">
			<span class="mui-icon mui-icon-gear"></span>
			<span class="mui-tab-label">设置</span>
		</router-link>
	</nav>
  </div>
</template>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
