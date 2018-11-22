import axios from "axios";

let baseUrl = "http://localhost:8080"
export const login = (params)=>{
    let p = new URLSearchParams();
    p.append("idcard",params.idcard);
    return axios.post(`${baseUrl}/basic/login`,p);
} 