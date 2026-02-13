package A9;

import android.graphics.Color;
import com.kt.apps.core.base.leanback.PagingIndicator;

/* loaded from: classes2.dex */
public final class R1 {

    /* renamed from: a, reason: collision with root package name */
    public float f946a;

    /* renamed from: b, reason: collision with root package name */
    public int f947b;

    /* renamed from: c, reason: collision with root package name */
    public float f948c;

    /* renamed from: d, reason: collision with root package name */
    public float f949d;

    /* renamed from: e, reason: collision with root package name */
    public float f950e;

    /* renamed from: f, reason: collision with root package name */
    public float f951f;
    public float g;

    /* renamed from: h, reason: collision with root package name */
    public float f952h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f953i;
    public final /* synthetic */ PagingIndicator j;

    public R1(PagingIndicator pagingIndicator) {
        this.j = pagingIndicator;
        this.f953i = pagingIndicator.f15986a ? 1.0f : -1.0f;
    }

    public final void a() {
        int round = Math.round(this.f946a * 255.0f);
        PagingIndicator pagingIndicator = this.j;
        this.f947b = Color.argb(round, Color.red(pagingIndicator.f15979D), Color.green(pagingIndicator.f15979D), Color.blue(pagingIndicator.f15979D));
    }

    public final void b() {
        this.f948c = 0.0f;
        this.f949d = 0.0f;
        PagingIndicator pagingIndicator = this.j;
        this.f950e = pagingIndicator.f15987b;
        float f4 = pagingIndicator.f15988c;
        this.f951f = f4;
        this.g = f4 * pagingIndicator.f15985J;
        this.f946a = 0.0f;
        a();
    }
}
