package com.bitget.openapi.api;

import com.bitget.openapi.dto.response.AllPosition;
import com.bitget.openapi.dto.response.FVirtualCaptialOperator;
import com.bitget.openapi.dto.response.Holds;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

/**
 *
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public interface PositionApi {
    /**
     * 所有合约持仓信息
     *
     * @return
     */
    @GET("/api/swap/v3/position/allPosition")
    Call<List<AllPosition>> getAllPosition();

    /**
     * 单个合约持仓信息
     * @param symbol 合约code
     * @return
     */
    @GET("/api/swap/v3/position/singlePosition")
    Call<AllPosition> getSinglePosition(@Query("symbol") String symbol);
    /**
     * 出入金接口
     * @param symbol 
     * @param ftype
     * @param limit
     * @param gt
     * @param lt
     * @return
     */
    @GET("/api/swap/v3/position/virtualCapital")
    Call<List<FVirtualCaptialOperator>> virtualCapital( @Query("symbol") String  symbol,
                                                        @Query("ftype") String ftype,
                                                        @Query("limit") Integer limit,
                                                        @Query("gt") Integer gt,
                                                        @Query("lt") Integer lt);
}
