package G3;

import android.app.Service;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.gms.internal.atv_ads_framework.zza;
import com.google.android.gms.internal.atv_ads_framework.zzd;
import com.google.android.tv.ads.controls.FallbackImageActivity;
import java.util.Iterator;
import tss.r.core.ads.ui.ProductDetailsActivity;

/* renamed from: G3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283e implements t, InterfaceC0285g, Lc.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4300a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4301b;

    public C0283e(Service service) {
        this.f4300a = 5;
        com.google.android.gms.common.internal.G.g(service);
        Context applicationContext = service.getApplicationContext();
        com.google.android.gms.common.internal.G.g(applicationContext);
        this.f4301b = applicationContext;
    }

    public C0283e(Context context) {
        this.f4300a = 3;
        context.getClass();
        this.f4301b = context;
        new zzd();
    }

    public /* synthetic */ C0283e(Context context, int i7) {
        this.f4300a = i7;
        this.f4301b = context;
    }

    @Override // Lc.f
    public void a(Jc.a ad) {
        kotlin.jvm.internal.l.e(ad, "ad");
        int i7 = ProductDetailsActivity.f24545X;
        Context context = this.f4301b;
        context.startActivity(c2.i.k(context, ad));
    }

    @Override // G3.InterfaceC0285g
    public Class b() {
        return AssetFileDescriptor.class;
    }

    @Override // G3.InterfaceC0285g
    public Object c(int i7, Resources.Theme theme, Resources resources) {
        return resources.openRawResourceFd(i7);
    }

    @Override // G3.InterfaceC0285g
    public void d(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }

    @Override // Lc.f
    public void e(Jc.a ad) {
        kotlin.jvm.internal.l.e(ad, "ad");
        int i7 = ProductDetailsActivity.f24545X;
        Context context = this.f4301b;
        context.startActivity(c2.i.k(context, ad));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    public void f(K6.c cVar) {
        String str;
        ?? r02 = cVar.f6195a;
        Iterator it = r02.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            K6.b bVar = (K6.b) it.next();
            String queryParameter = Uri.parse(bVar.f6194e).getQueryParameter("atvatc");
            if (queryParameter != null && queryParameter.equals("1")) {
                str = bVar.f6194e;
                break;
            }
        }
        Context context = this.f4301b;
        if (str == null) {
            if (r02.isEmpty()) {
                context.startActivity(new Intent().setClassName(context.getPackageName(), FallbackImageActivity.class.getName()).putExtra("render_error_message", true));
                return;
            } else {
                context.startActivity(new Intent().setClassName(context.getPackageName(), FallbackImageActivity.class.getName()).putExtra("icon_click_fallback_images", cVar));
                return;
            }
        }
        try {
            Intent putExtra = new Intent().setAction("com.google.android.tv.ads.intent.action.LAUNCH_ATC_MENU").putExtra("extra_atc_uri", str).putExtra("extra_publisher_package", context.getPackageName());
            zza zzaVar = zza.TV_LAUNCHER;
            int ordinal = zzd.zza(context).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    context.startActivity(putExtra.setPackage("com.google.android.apps.tv.launcherx"));
                    return;
                } else if (ordinal != 2) {
                    if (ordinal == 3) {
                        throw new IllegalStateException("AdsControlsManager should only be used on the Android TV platform.");
                    }
                    return;
                }
            }
            context.startActivity(putExtra.setPackage("com.google.android.tvrecommendations"));
        } catch (ActivityNotFoundException unused) {
            context.startActivity(new Intent().setClassName(context.getPackageName(), FallbackImageActivity.class.getName()).putExtra("render_error_message", true));
        }
    }

    @Override // G3.t
    public s m(y yVar) {
        switch (this.f4300a) {
            case 0:
                return new C0280b(this.f4301b, this);
            case 1:
                return new o(this.f4301b, 0);
            default:
                return new C0280b(this.f4301b, yVar.a(Integer.class, AssetFileDescriptor.class));
        }
    }
}
