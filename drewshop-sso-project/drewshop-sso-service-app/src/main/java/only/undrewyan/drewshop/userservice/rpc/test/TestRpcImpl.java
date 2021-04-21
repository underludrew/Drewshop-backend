package only.undrewyan.drewshop.userservice.rpc.test;

import only.undrewyan.drewshop.userservice.ssoservice.rpc.test.TestRpc;
import only.undrewyan.common.framework.vo.CommonResult;
import org.apache.dubbo.config.annotation.Service;


import static only.undrewyan.common.framework.vo.CommonResult.success;

@Service
public class TestRpcImpl implements TestRpc {


    @Override
    public CommonResult<String> test() {
        return success("success!!!!");
    }



}
