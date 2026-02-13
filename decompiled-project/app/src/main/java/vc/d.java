package vc;

import java.net.CookieManager;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import yc.C2482c;
import yc.E;

/* loaded from: classes2.dex */
public final class d extends c {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f25455p = 0;
    public String j;
    public E k;

    /* renamed from: n, reason: collision with root package name */
    public final CookieManager f25461n;

    /* renamed from: l, reason: collision with root package name */
    public boolean f25459l = false;

    /* renamed from: m, reason: collision with root package name */
    public final String f25460m = b.f25447c;

    /* renamed from: o, reason: collision with root package name */
    public final ReentrantLock f25462o = new ReentrantLock();

    /* renamed from: f, reason: collision with root package name */
    public int f25456f = 30000;
    public final int g = 2097152;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25457h = true;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f25458i = new ArrayList();

    static {
        System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
    }

    public d() {
        this.f25452b = 1;
        a("Accept-Encoding", "gzip");
        a("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        this.k = new E(new C2482c());
        this.f25461n = new CookieManager();
    }
}
