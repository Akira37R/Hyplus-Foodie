package top.hyperplasma.service;

import top.hyperplasma.dto.OrdersPaymentDTO;
import top.hyperplasma.dto.OrdersSubmitDTO;
import top.hyperplasma.result.PageResult;
import top.hyperplasma.vo.OrderPaymentVO;
import top.hyperplasma.vo.OrderSubmitVO;
import top.hyperplasma.vo.OrderVO;

public interface OrderService {

    /**
     * 用户下单
     *
     * @param ordersSubmitDTO
     * @return OrderSubmitVO
     */
    OrderSubmitVO submitOrder(OrdersSubmitDTO ordersSubmitDTO);

    /**
     * 订单支付
     *
     * @param ordersPaymentDTO
     * @return
     */
    OrderPaymentVO payment(OrdersPaymentDTO ordersPaymentDTO) throws Exception;

    /**
     * 支付成功，修改订单状态
     *
     * @param outTradeNo
     */
    void paySuccess(String outTradeNo);

    /**
     * 用户端订单分页查询
     *
     * @param page
     * @param pageSize
     * @param status
     * @return PageResult
     */
    PageResult pageQuery4User(int page, int pageSize, Integer status);

    /**
     * 查询订单详情
     *
     * @param id
     * @return OrderVO
     */
    OrderVO details(Long id);

    /**
     * 用户取消订单
     *
     * @param id
     */
    void userCancelById(Long id) throws Exception;

    /**
     * 再来一单
     *
     * @param id
     */
    void repetition(Long id);
}
