import java.util.List;

import static java.lang.String.format;
import static java.util.Collections.emptyList;

public class MaxProfit {

    enum Side {
        Buy, Sell
    }

    class Trade {
        int time;
        int qty;
        Side side;

        Trade(int time, int qty, Side side) {
            this.time = time;
            this.qty = qty;
            this.side = side;
        }

        @Override
        public String toString() {
            return format("Time: %s, Side: %s, Qty: %s", time, side, qty);
        }
    }

    class Solution {

        // Solution: DO NOT MODIFY
        public int[] solution(int[] prices) {
            return convertTrades(stockBuySellOnce(prices));
        }

        /**
         * Given an array of future stock prices, how would you go about maximizing
         * profit by buying and selling one unit of the stock once only (no short-selling)?
         */
        private List<Trade> stockBuySellOnce(int prices[]) {
            // TODO implement
            return emptyList();
        }

        // Utility function used in solution: DO NOT MODIFY
        private int[] convertTrades(List<Trade> trades) {
            int[] result = new int[trades.size() * 3];
            for (int tradeNum = 0; tradeNum < trades.size(); tradeNum++) {
                Trade currentTrade = trades.get(tradeNum);
                result[tradeNum * 3] = currentTrade.time;
                result[tradeNum * 3 + 1] = currentTrade.qty;
                result[tradeNum * 3 + 2] = currentTrade.side == Side.Buy ? 1 : 2;
            }
            return result;
        }
    }

}
