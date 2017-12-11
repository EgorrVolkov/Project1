package ua.training.MultiLang;

import java.util.Locale;
import java.util.ResourceBundle;

public interface Messages {

    String MESSAGES_BUNDLE_NAME = "messages";

    ResourceBundle messagesBundle =
            ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("en"));
    // TODO dynamically change locale in ServletChooseLanguage

    String TOTAL_POWER_CONSUMPTION = "total.power.consumption";
    String APPLIANCES_SORTED_BY_POWER_CONSUMPTION = "appliances.sorted.by.power.consumption";
    String APPLIANCE_FOUND_BY_NAME = "appliance.found.by.name";
}
