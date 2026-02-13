package C9;

import A9.T;
import A9.Y1;
import A9.Z1;
import W1.G;
import android.view.View;
import java.util.ArrayList;
import t8.C2034c;
import y9.s;

/* loaded from: classes2.dex */
public abstract class c implements View.OnKeyListener {

    /* renamed from: A, reason: collision with root package name */
    public int f3067A;

    /* renamed from: B, reason: collision with root package name */
    public String f3068B;

    /* renamed from: a, reason: collision with root package name */
    public final G f3069a;

    /* renamed from: b, reason: collision with root package name */
    public s f3070b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f3071c;

    /* renamed from: d, reason: collision with root package name */
    public final b f3072d;

    /* renamed from: e, reason: collision with root package name */
    public Z1 f3073e;

    /* renamed from: f, reason: collision with root package name */
    public d f3074f;

    /* renamed from: u, reason: collision with root package name */
    public Y1 f3075u;

    /* renamed from: w, reason: collision with root package name */
    public T f3077w;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3076v = false;

    /* renamed from: x, reason: collision with root package name */
    public int f3078x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f3079y = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3080z = false;

    public c(G g, b bVar) {
        this.f3069a = g;
        C2034c c2034c = new C2034c(this, 4);
        this.f3072d = bVar;
        bVar.f3094a = c2034c;
    }

    public abstract void a();

    public final void b() {
        this.f3072d.Q();
    }

    public final void c(s sVar) {
        s sVar2 = this.f3070b;
        if (sVar2 == sVar) {
            return;
        }
        if (sVar2 != null) {
            sVar2.b(null);
        }
        this.f3070b = sVar;
        if (sVar != null) {
            sVar.b(this);
        }
    }
}
