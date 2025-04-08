const base = {
    get() {
        return {
            url : "http://localhost:8080/zhinnengshequguanli/",
            name: "zhinnengshequguanli",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zhinnengshequguanli/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "智能社区管理系统"
        } 
    }
}
export default base
