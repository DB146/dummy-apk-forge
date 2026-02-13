package A1;

import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import com.kt.apps.media.xemtv.App;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ ShortcutInfo.Builder d(App app) {
        return new ShortcutInfo.Builder(app, "com.kt.apps.media.xemtv.2");
    }

    public static /* bridge */ /* synthetic */ ShortcutManager f(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return ShortcutManager.class;
    }

    public static /* synthetic */ void i() {
    }
}
