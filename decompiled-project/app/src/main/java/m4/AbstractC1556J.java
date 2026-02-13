package m4;

import java.util.HashSet;

/* renamed from: m4.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1556J {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f19956a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f19957b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (AbstractC1556J.class) {
            if (f19956a.add(str)) {
                f19957b += ", " + str;
            }
        }
    }
}
