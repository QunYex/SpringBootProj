package com.imooc.sell.utils;

import com.imooc.sell.VO.ResultVO;

public class ResultVOUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMessage("成功");
        return resultVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer code, String message){
        ResultVO resultVO = new ResultVO();
        resultVO.setMessage(message);
        resultVO.setCode(code);
        return resultVO;
    }
}
