package z;

import A0.AbstractC0017g;
import cc.InterfaceC0937i0;
import u0.C2075e;
import u0.C2080j;
import u0.EnumC2076f;

/* loaded from: classes.dex */
public abstract class G0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2532D f27869a = new C2532D(3, null, 2);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(u0.v r10, boolean r11, u0.EnumC2076f r12, Jb.a r13) {
        /*
            boolean r0 = r13 instanceof z.x0
            if (r0 == 0) goto L13
            r0 = r13
            z.x0 r0 = (z.x0) r0
            int r1 = r0.f28136e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28136e = r1
            goto L18
        L13:
            z.x0 r0 = new z.x0
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f28135d
            Ib.a r1 = Ib.a.f5345a
            int r2 = r0.f28136e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r10 = r0.f28134c
            u0.f r11 = r0.f28133b
            u0.v r12 = r0.f28132a
            com.bumptech.glide.c.c0(r13)
            r9 = r11
            r11 = r10
            r10 = r12
            r12 = r9
            goto L4b
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            com.bumptech.glide.c.c0(r13)
        L3c:
            r0.f28132a = r10
            r0.f28133b = r12
            r0.f28134c = r11
            r0.f28136e = r3
            java.lang.Object r13 = r10.a(r12, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            u0.e r13 = (u0.C2075e) r13
            java.lang.Object r2 = r13.f24754a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L55:
            if (r6 >= r4) goto L7c
            java.lang.Object r7 = r2.get(r6)
            u0.j r7 = (u0.C2080j) r7
            if (r11 == 0) goto L71
            boolean r8 = r7.b()
            if (r8 != 0) goto L6f
            boolean r8 = r7.f24769h
            if (r8 != 0) goto L6f
            boolean r7 = r7.f24766d
            if (r7 == 0) goto L6f
            r7 = r3
            goto L75
        L6f:
            r7 = r5
            goto L75
        L71:
            boolean r7 = u0.u.a(r7)
        L75:
            if (r7 != 0) goto L79
            r2 = r5
            goto L7d
        L79:
            int r6 = r6 + 1
            goto L55
        L7c:
            r2 = r3
        L7d:
            if (r2 == 0) goto L3c
            java.lang.Object r10 = r13.f24754a
            java.lang.Object r10 = r10.get(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z.G0.a(u0.v, boolean, u0.f, Jb.a):java.lang.Object");
    }

    public static void c(cc.E e2, InterfaceC0937i0 interfaceC0937i0, Rb.e eVar) {
        cc.F.B(e2, null, 4, new E0(interfaceC0937i0, eVar, null), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x017b -> B:11:0x017e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(u0.v vVar, EnumC2076f enumC2076f, Jb.a aVar) {
        F0 f02;
        int i7;
        u0.v vVar2;
        F0 f03;
        EnumC2076f enumC2076f2;
        u0.v vVar3;
        EnumC2076f enumC2076f3;
        F0 f04;
        C2075e c2075e;
        int size;
        int i10;
        ?? r12;
        int size2;
        int i11;
        char c10;
        Ib.a aVar2;
        Object a9;
        int size3;
        int i12;
        if (aVar instanceof F0) {
            F0 f05 = (F0) aVar;
            int i13 = f05.f27864d;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                f05.f27864d = i13 - Integer.MIN_VALUE;
                f02 = f05;
                Object obj = f02.f27863c;
                Ib.a aVar3 = Ib.a.f5345a;
                i7 = f02.f27864d;
                int i14 = 1;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    vVar2 = vVar;
                    f03 = f02;
                    enumC2076f2 = enumC2076f;
                    f03.f27861a = vVar2;
                    f03.f27862b = enumC2076f2;
                    f03.f27864d = i14;
                    a9 = vVar2.a(enumC2076f2, f03);
                    if (a9 != aVar3) {
                    }
                } else if (i7 == 1) {
                    enumC2076f3 = f02.f27862b;
                    vVar3 = f02.f27861a;
                    com.bumptech.glide.c.c0(obj);
                    f04 = f02;
                    c2075e = (C2075e) obj;
                    ?? r92 = c2075e.f24754a;
                    size = r92.size();
                    i10 = 0;
                    while (true) {
                        r12 = c2075e.f24754a;
                        if (i10 < size) {
                        }
                        i10++;
                    }
                    size2 = r12.size();
                    i11 = 0;
                    F0 f06 = f04;
                    while (i11 < size2) {
                    }
                    Ib.a aVar4 = aVar3;
                    EnumC2076f enumC2076f4 = enumC2076f3;
                    f03 = f06;
                    EnumC2076f enumC2076f5 = EnumC2076f.f24759c;
                    f03.f27861a = vVar3;
                    enumC2076f2 = enumC2076f4;
                    f03.f27862b = enumC2076f2;
                    c10 = 2;
                    f03.f27864d = 2;
                    obj = vVar3.a(enumC2076f5, f03);
                    aVar2 = aVar4;
                    if (obj == aVar2) {
                    }
                    ?? r02 = ((C2075e) obj).f24754a;
                    size3 = r02.size();
                    while (i12 < size3) {
                    }
                    aVar3 = aVar2;
                    vVar2 = vVar3;
                    i14 = 1;
                    f03.f27861a = vVar2;
                    f03.f27862b = enumC2076f2;
                    f03.f27864d = i14;
                    a9 = vVar2.a(enumC2076f2, f03);
                    if (a9 != aVar3) {
                    }
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    EnumC2076f enumC2076f6 = f02.f27862b;
                    vVar3 = f02.f27861a;
                    com.bumptech.glide.c.c0(obj);
                    aVar2 = aVar3;
                    c10 = 2;
                    f03 = f02;
                    enumC2076f2 = enumC2076f6;
                    ?? r022 = ((C2075e) obj).f24754a;
                    size3 = r022.size();
                    for (i12 = 0; i12 < size3; i12++) {
                        if (((C2080j) r022.get(i12)).b()) {
                            return null;
                        }
                    }
                    aVar3 = aVar2;
                    vVar2 = vVar3;
                    i14 = 1;
                    f03.f27861a = vVar2;
                    f03.f27862b = enumC2076f2;
                    f03.f27864d = i14;
                    a9 = vVar2.a(enumC2076f2, f03);
                    if (a9 != aVar3) {
                        return aVar3;
                    }
                    vVar3 = vVar2;
                    obj = a9;
                    F0 f07 = f03;
                    enumC2076f3 = enumC2076f2;
                    f04 = f07;
                    c2075e = (C2075e) obj;
                    ?? r922 = c2075e.f24754a;
                    size = r922.size();
                    i10 = 0;
                    while (true) {
                        r12 = c2075e.f24754a;
                        if (i10 < size) {
                            return r12.get(0);
                        }
                        C2080j c2080j = (C2080j) r922.get(i10);
                        if (c2080j.b() || !c2080j.f24769h || c2080j.f24766d) {
                            break;
                        }
                        i10++;
                    }
                    size2 = r12.size();
                    i11 = 0;
                    F0 f062 = f04;
                    while (i11 < size2) {
                        C2080j c2080j2 = (C2080j) r12.get(i11);
                        if (c2080j2.b()) {
                            return null;
                        }
                        long j = vVar3.f24806f.L;
                        u0.y yVar = vVar3.f24806f;
                        yVar.getClass();
                        long G9 = yVar.G(AbstractC0017g.t(yVar).f55N.c());
                        long j10 = yVar.L;
                        Ib.a aVar5 = aVar3;
                        EnumC2076f enumC2076f7 = enumC2076f3;
                        int i15 = size2;
                        F0 f08 = f062;
                        long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (G9 >> 32)) - ((int) (j10 >> 32))) / 2.0f) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (G9 & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f) & 4294967295L);
                        boolean e2 = u0.u.e(c2080j2.f24770i, 1);
                        long j11 = c2080j2.f24765c;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                        float f4 = e2 ? 1.0f : 0.0f;
                        float f10 = intBitsToFloat3 * f4;
                        float f11 = ((int) (j >> 32)) + f10;
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) * f4;
                        if (((intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat < (-f10)) | (intBitsToFloat > f11)) || (intBitsToFloat2 > ((int) (j & 4294967295L)) + intBitsToFloat4)) {
                            return null;
                        }
                        i11++;
                        size2 = i15;
                        f062 = f08;
                        aVar3 = aVar5;
                        enumC2076f3 = enumC2076f7;
                    }
                    Ib.a aVar42 = aVar3;
                    EnumC2076f enumC2076f42 = enumC2076f3;
                    f03 = f062;
                    EnumC2076f enumC2076f52 = EnumC2076f.f24759c;
                    f03.f27861a = vVar3;
                    enumC2076f2 = enumC2076f42;
                    f03.f27862b = enumC2076f2;
                    c10 = 2;
                    f03.f27864d = 2;
                    obj = vVar3.a(enumC2076f52, f03);
                    aVar2 = aVar42;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    ?? r0222 = ((C2075e) obj).f24754a;
                    size3 = r0222.size();
                    while (i12 < size3) {
                    }
                    aVar3 = aVar2;
                    vVar2 = vVar3;
                    i14 = 1;
                    f03.f27861a = vVar2;
                    f03.f27862b = enumC2076f2;
                    f03.f27864d = i14;
                    a9 = vVar2.a(enumC2076f2, f03);
                    if (a9 != aVar3) {
                    }
                }
            }
        }
        f02 = new Jb.c(aVar);
        Object obj2 = f02.f27863c;
        Ib.a aVar32 = Ib.a.f5345a;
        i7 = f02.f27864d;
        int i142 = 1;
        if (i7 != 0) {
        }
    }
}
