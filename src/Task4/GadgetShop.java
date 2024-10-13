package Task4;

public class GadgetShop {
    private int[] usbCables;
    private int[] keyboards;

    public GadgetShop(int[] usbCables, int[] keyboards) {
        this.usbCables = usbCables;
        this.keyboards = keyboards;
    }

    public int getCheapestKeyboard() {
        int cheapestKeyboard = Integer.MAX_VALUE;
        for (int price : this.keyboards) {
            if (price < cheapestKeyboard) {
                cheapestKeyboard = price;
            }
        }
        return cheapestKeyboard;
    }

    public int getMostExpensiveGadget() {
        int mostExpensiveCable = -1;
        int mostExpensiveKeyboard = -1;
        for (int price : this.usbCables) {
            if (price > mostExpensiveCable) {
                mostExpensiveCable = price;
            }
        }
        for (int price : this.keyboards) {
            if (price > mostExpensiveKeyboard) {
                mostExpensiveKeyboard = price;
            }
        }
        return Math.max(mostExpensiveCable, mostExpensiveKeyboard);
    }

    public int getBestUsbCableWithinBudget(int budget) {
        int bestUsbCable = -1;
        for (int price : this.usbCables) {
            if (price <= budget && price > bestUsbCable) {
                bestUsbCable = price;
            }
        }
        return bestUsbCable;
    }

    public int getBestDealWithinBudget(int budget) {
        int bestDealWithinBudget = -1;
        for (int usbPrice : this.usbCables) {
            for (int keyboardPrice : this.keyboards) {
                int deal = usbPrice + keyboardPrice;
                if (deal <= budget && deal > bestDealWithinBudget) {
                    bestDealWithinBudget = deal;
                }
            }
        }
        return bestDealWithinBudget;
    }
}