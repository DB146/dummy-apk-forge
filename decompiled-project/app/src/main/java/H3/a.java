package H3;

import A3.k;
import A3.l;
import D5.i;
import G3.p;
import G3.q;
import G3.r;
import G3.s;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class a implements s {

    /* renamed from: b, reason: collision with root package name */
    public static final k f4868b = k.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a, reason: collision with root package name */
    public final i f4869a;

    public a(i iVar) {
        this.f4869a = iVar;
    }

    @Override // G3.s
    public final r a(Object obj, int i7, int i10, l lVar) {
        G3.i iVar = (G3.i) obj;
        i iVar2 = this.f4869a;
        if (iVar2 != null) {
            q a9 = q.a(iVar);
            p pVar = (p) iVar2.f3256b;
            Object a10 = pVar.a(a9);
            ArrayDeque arrayDeque = q.f4325b;
            synchronized (arrayDeque) {
                arrayDeque.offer(a9);
            }
            G3.i iVar3 = (G3.i) a10;
            if (iVar3 == null) {
                pVar.d(q.a(iVar), iVar);
            } else {
                iVar = iVar3;
            }
        }
        return new r(iVar, new com.bumptech.glide.load.data.k(iVar, ((Integer) lVar.c(f4868b)).intValue()));
    }

    @Override // G3.s
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
