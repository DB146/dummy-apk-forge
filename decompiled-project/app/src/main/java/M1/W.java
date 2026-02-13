package M1;

/* loaded from: classes.dex */
public final class W extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public N f6641a;

    /* renamed from: b, reason: collision with root package name */
    public int f6642b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r8.o f6643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(r8.o oVar, Hb.d dVar) {
        super(2, dVar);
        this.f6643c = oVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new W(this.f6643c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((W) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0057 -> B:6:0x005a). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            Ib.a r0 = Ib.a.f5345a
            int r1 = r6.f6642b
            r2 = 2
            r3 = 1
            r8.o r4 = r6.f6643c
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            com.bumptech.glide.c.c0(r7)
            goto L5a
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            M1.N r1 = r6.f6641a
            com.bumptech.glide.c.c0(r7)
            goto L4e
        L20:
            com.bumptech.glide.c.c0(r7)
            java.lang.Object r7 = r4.f23860e
            M1.a r7 = (M1.C0386a) r7
            java.util.concurrent.atomic.AtomicInteger r7 = r7.f6654a
            int r7 = r7.get()
            if (r7 <= 0) goto L69
        L2f:
            java.lang.Object r7 = r4.f23857b
            cc.E r7 = (cc.E) r7
            Hb.i r7 = r7.l()
            cc.F.m(r7)
            java.lang.Object r7 = r4.f23858c
            r1 = r7
            M1.N r1 = (M1.N) r1
            r6.f6641a = r1
            r6.f6642b = r3
            java.lang.Object r7 = r4.f23859d
            ec.d r7 = (ec.d) r7
            java.lang.Object r7 = r7.c(r6)
            if (r7 != r0) goto L4e
            return r0
        L4e:
            r5 = 0
            r6.f6641a = r5
            r6.f6642b = r2
            java.lang.Object r7 = r1.invoke(r7, r6)
            if (r7 != r0) goto L5a
            return r0
        L5a:
            java.lang.Object r7 = r4.f23860e
            M1.a r7 = (M1.C0386a) r7
            java.util.concurrent.atomic.AtomicInteger r7 = r7.f6654a
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L2f
            Db.q r7 = Db.q.f3365a
            return r7
        L69:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.W.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
