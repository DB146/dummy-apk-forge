package y;

/* renamed from: y.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2304l extends Jb.h implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public int f26483b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26484c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2305m f26485d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2304l(C2305m c2305m, Hb.d dVar) {
        super(dVar);
        this.f26485d = c2305m;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C2304l c2304l = new C2304l(this.f26485d, dVar);
        c2304l.f26484c = obj;
        return c2304l;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2304l) create((u0.v) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0065  */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x004d -> B:6:0x0050). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            Ib.a r0 = Ib.a.f5345a
            int r1 = r11.f26483b
            r2 = 2
            r3 = 1
            y.m r4 = r11.f26485d
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r11.f26484c
            u0.v r1 = (u0.v) r1
            com.bumptech.glide.c.c0(r12)
            goto L50
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            java.lang.Object r1 = r11.f26484c
            u0.v r1 = (u0.v) r1
            com.bumptech.glide.c.c0(r12)
            goto L39
        L26:
            com.bumptech.glide.c.c0(r12)
            java.lang.Object r12 = r11.f26484c
            r1 = r12
            u0.v r1 = (u0.v) r1
            r11.f26484c = r1
            r11.f26483b = r3
            java.lang.Object r12 = z.G0.b(r1, r11, r2)
            if (r12 != r0) goto L39
            return r0
        L39:
            u0.j r12 = (u0.C2080j) r12
            long r5 = r12.f24763a
            r4.f26492h = r5
            long r5 = r12.f24765c
            r4.f26487b = r5
        L43:
            r11.f26484c = r1
            r11.f26483b = r2
            u0.f r12 = u0.EnumC2076f.f24758b
            java.lang.Object r12 = r1.a(r12, r11)
            if (r12 != r0) goto L50
            return r0
        L50:
            u0.e r12 = (u0.C2075e) r12
            java.lang.Object r12 = r12.f24754a
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = r12.size()
            r3.<init>(r5)
            int r5 = r12.size()
            r6 = 0
            r7 = r6
        L63:
            if (r7 >= r5) goto L76
            java.lang.Object r8 = r12.get(r7)
            r9 = r8
            u0.j r9 = (u0.C2080j) r9
            boolean r9 = r9.f24766d
            if (r9 == 0) goto L73
            r3.add(r8)
        L73:
            int r7 = r7 + 1
            goto L63
        L76:
            int r12 = r3.size()
        L7a:
            if (r6 >= r12) goto L91
            java.lang.Object r5 = r3.get(r6)
            r7 = r5
            u0.j r7 = (u0.C2080j) r7
            long r7 = r7.f24763a
            long r9 = r4.f26492h
            boolean r7 = u0.u.d(r7, r9)
            if (r7 == 0) goto L8e
            goto L92
        L8e:
            int r6 = r6 + 1
            goto L7a
        L91:
            r5 = 0
        L92:
            u0.j r5 = (u0.C2080j) r5
            if (r5 != 0) goto L9d
            java.lang.Object r12 = Eb.o.Z(r3)
            r5 = r12
            u0.j r5 = (u0.C2080j) r5
        L9d:
            if (r5 == 0) goto La7
            long r6 = r5.f24763a
            r4.f26492h = r6
            long r5 = r5.f24765c
            r4.f26487b = r5
        La7:
            boolean r12 = r3.isEmpty()
            if (r12 == 0) goto L43
            r0 = -1
            r4.f26492h = r0
            Db.q r12 = Db.q.f3365a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C2304l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
