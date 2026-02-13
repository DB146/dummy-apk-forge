package c5;

import java.util.List;
import n5.v;

/* renamed from: c5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0907a extends a5.f {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f14348A;

    /* renamed from: B, reason: collision with root package name */
    public final Object f14349B;

    public C0907a() {
        this.f14348A = 1;
        this.f14349B = new v();
    }

    public C0907a(List list) {
        this.f14348A = 0;
        v vVar = new v((byte[]) list.get(0));
        this.f14349B = new i(vVar.A(), vVar.A());
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // a5.f
    public final a5.g b(int r48, boolean r49, byte[] r50) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.C0907a.b(int, boolean, byte[]):a5.g");
    }
}
