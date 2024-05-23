package features.implementations;

import features.Navigator;

public class Safari implements Navigator {
    @Override
    public void showPage(String url) {
        System.out.println("Opening " + url + " in Safari");
    }

    @Override
    public void openNewTab() {
        System.out.println("Opening new tab in Safari");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page in Safari");
    }
}
