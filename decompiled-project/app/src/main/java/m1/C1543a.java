package m1;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import c.AbstractC0862f;
import com.kt.apps.media.xemtv.App;
import java.util.HashSet;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1543a {

    /* renamed from: a, reason: collision with root package name */
    public App f19770a;

    /* renamed from: b, reason: collision with root package name */
    public Intent[] f19771b;

    /* renamed from: c, reason: collision with root package name */
    public String f19772c;

    /* renamed from: d, reason: collision with root package name */
    public String f19773d;

    /* renamed from: e, reason: collision with root package name */
    public IconCompat f19774e;

    /* renamed from: f, reason: collision with root package name */
    public HashSet f19775f;
    public PersistableBundle g;

    public final ShortcutInfo a() {
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder intents;
        ShortcutInfo build;
        A1.a.i();
        shortLabel = A1.a.d(this.f19770a).setShortLabel(this.f19772c);
        intents = shortLabel.setIntents(this.f19771b);
        IconCompat iconCompat = this.f19774e;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.g(this.f19770a));
        }
        if (!TextUtils.isEmpty(this.f19773d)) {
            intents.setLongLabel(this.f19773d);
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setDisabledMessage(null);
        }
        HashSet hashSet = this.f19775f;
        if (hashSet != null) {
            intents.setCategories(hashSet);
        }
        intents.setRank(0);
        PersistableBundle persistableBundle = this.g;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            intents.setLongLived(false);
        } else {
            if (this.g == null) {
                this.g = new PersistableBundle();
            }
            this.g.putBoolean("extraLongLived", false);
            intents.setExtras(this.g);
        }
        if (i7 >= 33) {
            AbstractC0862f.g(intents);
        }
        build = intents.build();
        return build;
    }
}
