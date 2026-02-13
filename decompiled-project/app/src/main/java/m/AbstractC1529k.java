package m;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* renamed from: m.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1529k {
    public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    public static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i7) {
        return callback.onWindowStartingActionMode(callback2, i7);
    }
}
