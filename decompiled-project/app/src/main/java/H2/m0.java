package H2;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public int f4750a;

    /* renamed from: b, reason: collision with root package name */
    public int f4751b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4752c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4753d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4754e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f4755f;
    public final /* synthetic */ StaggeredGridLayoutManager g;

    public m0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f4750a = -1;
        this.f4751b = Integer.MIN_VALUE;
        this.f4752c = false;
        this.f4753d = false;
        this.f4754e = false;
        int[] iArr = this.f4755f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
