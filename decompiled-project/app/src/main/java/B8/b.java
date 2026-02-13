package B8;

import java.util.Iterator;
import java.util.Map;
import mc.InterfaceC1656a;

/* loaded from: classes.dex */
public final class b extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public Map f2218a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f2219b;

    /* renamed from: c, reason: collision with root package name */
    public d f2220c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1656a f2221d;

    /* renamed from: e, reason: collision with root package name */
    public Map f2222e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2223f;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f2224u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f2225v;

    /* renamed from: w, reason: collision with root package name */
    public int f2226w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Jb.c cVar2) {
        super(cVar2);
        this.f2225v = cVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f2224u = obj;
        this.f2226w |= Integer.MIN_VALUE;
        return this.f2225v.b(this);
    }
}
