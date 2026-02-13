package m;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1521c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f19620f;

    /* renamed from: a, reason: collision with root package name */
    public int f19621a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f19622b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f19623c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f19624d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f19625e;

    public C1521c(Context context, int i7) {
        super(context);
        this.f19621a = i7;
    }

    public final void a(Configuration configuration) {
        if (this.f19625e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f19624d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f19624d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f19622b == null) {
            this.f19622b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f19622b.setTo(theme);
            }
        }
        this.f19622b.applyStyle(this.f19621a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(m.C1521c.f19620f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f19625e == null) {
            Configuration configuration = this.f19624d;
            if (configuration != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f19620f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f19620f = configuration2;
                    }
                }
                this.f19625e = createConfigurationContext(this.f19624d).getResources();
            }
            this.f19625e = super.getResources();
        }
        return this.f19625e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f19623c == null) {
            this.f19623c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f19623c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f19622b;
        if (theme != null) {
            return theme;
        }
        if (this.f19621a == 0) {
            this.f19621a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f19622b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i7) {
        if (this.f19621a != i7) {
            this.f19621a = i7;
            b();
        }
    }
}
