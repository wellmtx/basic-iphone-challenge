package features.implementations;

import features.Navigator;

public class Firefox implements Navigator {
    @Override
    public void showPage(String url) {
        System.out.println("Opening " + url + " in Firefox");
    }

    @Override
    public void openNewTab() {
        System.out.println("Opening new tab in Firefox");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page in Firefox");
    }
}
