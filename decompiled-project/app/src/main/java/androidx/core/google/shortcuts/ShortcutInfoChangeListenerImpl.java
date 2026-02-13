package androidx.core.google.shortcuts;

import I2.I;
import P4.C0463k;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.G;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m1.C1543a;
import o1.C1776a;
import o1.C1777b;
import s5.b;
import s5.e;
import s5.f;

/* loaded from: classes.dex */
public class ShortcutInfoChangeListenerImpl {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13270a;

    /* renamed from: b, reason: collision with root package name */
    public final b f13271b;

    /* renamed from: c, reason: collision with root package name */
    public final f f13272c;

    /* renamed from: d, reason: collision with root package name */
    public final C0463k f13273d;

    public ShortcutInfoChangeListenerImpl(Context context, b bVar, f fVar, C0463k c0463k) {
        this.f13270a = context;
        this.f13271b = bVar;
        this.f13272c = fVar;
        this.f13273d = c0463k;
    }

    public static ShortcutInfoChangeListenerImpl getInstance(Context context) {
        return new ShortcutInfoChangeListenerImpl(context, b.getInstance(context), f.getInstance(context), c.D(context));
    }

    public final void a(List list) {
        Iterator it;
        String[] stringArray;
        Iterator it2;
        Iterator it3;
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it4 = list.iterator();
        while (true) {
            int i7 = 0;
            if (!it4.hasNext()) {
                this.f13271b.update((e[]) arrayList.toArray(new e[0]));
                return;
            }
            C1543a c1543a = (C1543a) it4.next();
            c1543a.getClass();
            Context context = this.f13270a;
            Intent intent = new Intent(context, (Class<?>) TrampolineActivity.class);
            intent.setAction("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.putExtra("id", "com.kt.apps.media.xemtv.2");
            String uri = intent.toUri(1);
            Intent[] intentArr = c1543a.f19771b;
            String uri2 = intentArr[intentArr.length - 1].toUri(1);
            C0463k c0463k = this.f13273d;
            if (c0463k != null) {
                try {
                    String encodeToString = Base64.encodeToString(c0463k.p().b(uri2.getBytes(Charset.forName("UTF-8"))), 0);
                    Intent intent2 = new Intent(context, (Class<?>) TrampolineActivity.class);
                    intent2.setPackage(context.getPackageName());
                    intent2.setAction("androidx.core.content.pm.SHORTCUT_LISTENER");
                    intent2.putExtra("shortcutUrl", uri2);
                    intent2.putExtra("shortcutTag", encodeToString);
                    uri2 = intent2.toUri(1);
                } catch (GeneralSecurityException e2) {
                    Log.e("ShortcutUtils", "failed to generate tag for shortcut.", e2);
                }
            }
            String str2 = c1543a.f19772c.toString();
            I i10 = new I("Shortcut");
            i10.k("id", "com.kt.apps.media.xemtv.2");
            G.g(uri);
            i10.f5050c = uri;
            G.g(str2);
            String str3 = "name";
            i10.k("name", str2);
            i10.k("shortcutLabel", str2);
            i10.k("shortcutUrl", uri2);
            String str4 = c1543a.f19773d;
            if (str4 != null) {
                String str5 = str4.toString();
                G.g(str5);
                i10.k("description", str5);
                i10.k("shortcutDescription", str5);
            }
            if (c1543a.f19775f != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it5 = c1543a.f19775f.iterator();
                while (it5.hasNext()) {
                    String str6 = (String) it5.next();
                    if (str6.startsWith("actions.intent.")) {
                        PersistableBundle persistableBundle = c1543a.g;
                        I i11 = new I("Capability");
                        i11.k(str3, str6);
                        if (persistableBundle == null || (stringArray = persistableBundle.getStringArray(str6)) == null) {
                            it2 = it4;
                            it3 = it5;
                            str = str3;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            int length = stringArray.length;
                            int i12 = i7;
                            while (i12 < length) {
                                String str7 = stringArray[i12];
                                Iterator it6 = it4;
                                Iterator it7 = it5;
                                I i13 = new I("Parameter");
                                G.g(str7);
                                i13.k(str3, str7);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str6);
                                String str8 = str3;
                                sb2.append("/");
                                sb2.append(str7);
                                String[] stringArray2 = persistableBundle.getStringArray(sb2.toString());
                                if (stringArray2 != null && stringArray2.length != 0) {
                                    i13.k("value", stringArray2);
                                    arrayList3.add(i13);
                                }
                                i12++;
                                it4 = it6;
                                it5 = it7;
                                str3 = str8;
                            }
                            it2 = it4;
                            it3 = it5;
                            str = str3;
                            if (arrayList3.size() > 0) {
                                i11.j("parameter", (C1777b[]) arrayList3.toArray(new C1777b[0]));
                            }
                        }
                        arrayList2.add(i11);
                        it4 = it2;
                        it5 = it3;
                        str3 = str;
                        i7 = 0;
                    }
                }
                it = it4;
                if (!arrayList2.isEmpty()) {
                    i10.j("capability", (C1776a[]) arrayList2.toArray(new C1776a[0]));
                }
            } else {
                it = it4;
            }
            IconCompat iconCompat = c1543a.f19774e;
            if (iconCompat != null && (iconCompat.d() == 6 || iconCompat.d() == 4)) {
                String uri3 = iconCompat.e().toString();
                G.g(uri3);
                i10.k("image", uri3);
            }
            arrayList.add(i10.b());
            it4 = it;
        }
    }
}
