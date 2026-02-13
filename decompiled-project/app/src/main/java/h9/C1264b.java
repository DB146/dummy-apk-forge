package h9;

import A4.s;
import H2.r0;
import P8.j;
import P8.l;
import P8.n;
import P8.p;
import com.google.android.gms.common.api.f;
import i9.AbstractC1354f;
import i9.C1350b;
import i9.C1352d;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import k9.AbstractC1434a;
import n5.u;

/* renamed from: h9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1264b implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final n[] f17895a = new n[0];

    public static int b(p pVar, p pVar2) {
        if (pVar == null || pVar2 == null) {
            return 0;
        }
        return (int) Math.abs(pVar.f8249a - pVar2.f8249a);
    }

    public static int c(p pVar, p pVar2) {
        return (pVar == null || pVar2 == null) ? f.API_PRIORITY_OTHER : (int) Math.abs(pVar.f8249a - pVar2.f8249a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02f3, code lost:
    
        r1 = r1.f4793b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02f6, code lost:
    
        r1 = r1.f4794c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02fb, code lost:
    
        if (r10 < 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0300, code lost:
    
        if (r10 > (r2 + 1)) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0302, code lost:
    
        r1 = r5[r10].h(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x030b, code lost:
    
        if (r1 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x030d, code lost:
    
        if (r9 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x030f, code lost:
    
        r1 = r1.f4794c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0312, code lost:
    
        r1 = r1.f4793b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0315, code lost:
    
        r3 = r13;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0317, code lost:
    
        r3 = r3 - r22;
        r40 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x031b, code lost:
    
        if (r3 < 0) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0320, code lost:
    
        if (r3 > (r2 + 1)) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0322, code lost:
    
        r10 = (H2.r0[]) r5[r3].f16841c;
        r13 = r10.length;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x032c, code lost:
    
        if (r3 >= r13) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x032e, code lost:
    
        r30 = r13;
        r13 = r10[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0332, code lost:
    
        if (r13 == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0345, code lost:
    
        r3 = r3 + 1;
        r13 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0334, code lost:
    
        r3 = r13.f4793b;
        r10 = r13.f4794c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0338, code lost:
    
        if (r9 == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x033a, code lost:
    
        r13 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x033d, code lost:
    
        r1 = ((r10 - r3) * (r22 * r1)) + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x033c, code lost:
    
        r13 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x034a, code lost:
    
        r1 = r1 + 1;
        r3 = r3;
        r13 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0351, code lost:
    
        if (r9 == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0353, code lost:
    
        r1 = ((i9.C1350b) r14.f21225e).f18469f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x035a, code lost:
    
        r1 = ((i9.C1350b) r14.f21225e).g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0309, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02d4, code lost:
    
        r39 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02db, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02d7, code lost:
    
        r39 = r1;
        r38 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02b7, code lost:
    
        r22 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03b6, code lost:
    
        r39 = r1;
        r38 = r3;
        r37 = r10;
        r1 = 1;
        r6 = r15;
        r15 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x028a, code lost:
    
        r18 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0297, code lost:
    
        r20 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x029b, code lost:
    
        if (r13 != 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x029d, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02a0, code lost:
    
        r0 = new i9.C1352d(r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x029f, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0273, code lost:
    
        r13 = r7 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03ce, code lost:
    
        r18 = r0;
        r39 = r1;
        r38 = r3;
        r0 = (H2.r0) r14.f21223c;
        r8 = new int[]{r1, r2 + 2};
        r1 = r0.f4797f;
        r3 = (i9.C1349a[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) i9.C1349a.class, r8);
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03ef, code lost:
    
        if (r6 >= r3.length) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03f1, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03f2, code lost:
    
        r9 = r3[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03f5, code lost:
    
        if (r8 >= r9.length) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03f7, code lost:
    
        r9[r8] = new i9.C1349a();
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0401, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0404, code lost:
    
        r6 = 0;
        r14.b(r5[0]);
        r14.b(r5[r7]);
        r9 = 928;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0411, code lost:
    
        r10 = r5[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0413, code lost:
    
        if (r10 == null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0415, code lost:
    
        r6 = r5[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0417, code lost:
    
        if (r6 != null) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x041a, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x041b, code lost:
    
        r12 = (H2.r0[]) r10.f16841c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0420, code lost:
    
        if (r11 >= r12.length) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0422, code lost:
    
        r13 = r12[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0424, code lost:
    
        if (r13 == null) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0426, code lost:
    
        r14 = ((H2.r0[]) r6.f16841c)[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x042c, code lost:
    
        if (r14 == null) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0432, code lost:
    
        if (r13.f4797f != r14.f4797f) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0434, code lost:
    
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0435, code lost:
    
        if (r13 > r2) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0437, code lost:
    
        r14 = ((H2.r0[]) r5[r13].f16841c)[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x043f, code lost:
    
        if (r14 != null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0459, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0443, code lost:
    
        r15 = r12[r11].f4797f;
        r14.f4797f = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x044d, code lost:
    
        if (r14.c(r15) != false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x044f, code lost:
    
        ((H2.r0[]) r5[r13].f16841c)[r11] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x045b, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x045e, code lost:
    
        r10 = r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0461, code lost:
    
        if (r10 != null) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0463, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x04ab, code lost:
    
        r6 = r5[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x04ad, code lost:
    
        if (r6 != null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x04af, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0501, code lost:
    
        r6 = r11 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0503, code lost:
    
        if (r6 != 0) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0505, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x061a, code lost:
    
        if (r6 <= 0) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x061c, code lost:
    
        if (r6 < r9) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x061f, code lost:
    
        r9 = r6;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0623, code lost:
    
        r6 = r5.length;
        r7 = 0;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0626, code lost:
    
        if (r7 >= r6) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0628, code lost:
    
        r9 = r5[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x062a, code lost:
    
        if (r9 == null) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x062c, code lost:
    
        r9 = (H2.r0[]) r9.f16841c;
        r10 = r9.length;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0632, code lost:
    
        if (r11 >= r10) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0634, code lost:
    
        r12 = r9[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0636, code lost:
    
        if (r12 == null) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0638, code lost:
    
        r13 = r12.f4797f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x063a, code lost:
    
        if (r13 < 0) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x063d, code lost:
    
        if (r13 < r3.length) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0641, code lost:
    
        r3[r13][r8].b(r12.f4796e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x064b, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x064d, code lost:
    
        r8 = r8 + 1;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0651, code lost:
    
        r5 = r3[0][1];
        r6 = r5.a();
        r7 = r2 * r1;
        r0 = r0.f4794c;
        r9 = r7 - (2 << r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0665, code lost:
    
        if (r6.length != 0) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0667, code lost:
    
        if (r9 < 1) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x066b, code lost:
    
        if (r9 > 928) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x066d, code lost:
    
        r5.b(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0684, code lost:
    
        r5 = new java.util.ArrayList();
        r6 = new int[r7];
        r7 = new java.util.ArrayList();
        r9 = new java.util.ArrayList();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0696, code lost:
    
        if (r10 >= r1) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0698, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0699, code lost:
    
        if (r11 >= r2) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x069b, code lost:
    
        r14 = r11 + 1;
        r12 = r3[r10][r14].a();
        r13 = (r10 * r2) + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x06aa, code lost:
    
        if (r12.length != 0) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x06ac, code lost:
    
        r5.add(java.lang.Integer.valueOf(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x06c9, code lost:
    
        r11 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x06b7, code lost:
    
        if (r12.length != 1) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x06b9, code lost:
    
        r6[r13] = r12[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x06bf, code lost:
    
        r9.add(java.lang.Integer.valueOf(r13));
        r7.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x06cb, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x06ce, code lost:
    
        r1 = r7.size();
        r2 = new int[r1];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x06d6, code lost:
    
        if (r3 >= r1) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x06d8, code lost:
    
        r2[r3] = (int[]) r7.get(r3);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x06e2, code lost:
    
        r1 = h9.AbstractC1263a.a(r5);
        r3 = h9.AbstractC1263a.a(r9);
        r5 = r3.length;
        r7 = new int[r5];
        r9 = 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x06f0, code lost:
    
        r11 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x06f2, code lost:
    
        if (r9 <= 0) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x06f4, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x06f5, code lost:
    
        if (r9 >= r5) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x06f7, code lost:
    
        r6[r3[r9]] = r2[r9][r7[r9]];
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0704, code lost:
    
        r0 = i9.AbstractC1354f.b(r6, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0708, code lost:
    
        r1 = new P8.n(r0.f10207b, null, r4, P8.a.f8190y);
        r1.b(P8.o.f8239c, r0.f10209d);
        r1.b(P8.o.f8240d, r0.f10210e);
        r1.b(P8.o.f8241e, r0.f10211f);
        r0 = (h9.c) r0.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x072b, code lost:
    
        if (r0 == null) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x072d, code lost:
    
        r1.b(P8.o.f8246x, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0732, code lost:
    
        r12 = r39;
        r1.b(P8.o.f8237a, java.lang.Integer.valueOf(r12.f470a));
        r1.b(P8.o.f8235A, "]L0");
        r13 = r38;
        r13.add(r1);
        r1 = r12;
        r3 = r13;
        r0 = r18;
        r8 = 4;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0754, code lost:
    
        r13 = r38;
        r12 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0759, code lost:
    
        if (r5 != 0) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x075b, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x075c, code lost:
    
        if (r14 >= r5) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x075e, code lost:
    
        r15 = r7[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0767, code lost:
    
        if (r15 < (r2[r14].length - 1)) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x076e, code lost:
    
        r7[r14] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0773, code lost:
    
        if (r14 != (r5 - 1)) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0775, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x077d, code lost:
    
        throw P8.c.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0769, code lost:
    
        r7[r14] = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0780, code lost:
    
        r9 = r11;
        r39 = r12;
        r38 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x078c, code lost:
    
        throw P8.c.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0791, code lost:
    
        throw P8.c.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0675, code lost:
    
        throw P8.j.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x067b, code lost:
    
        if (r6[0] == r9) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x067d, code lost:
    
        if (r9 < 1) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x067f, code lost:
    
        if (r9 > 928) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0681, code lost:
    
        r5.b(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0514, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0515, code lost:
    
        if (r8 >= r7) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0517, code lost:
    
        r10 = (H2.r0[]) r5[r8].f16841c;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x051f, code lost:
    
        if (r11 >= r10.length) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0521, code lost:
    
        r12 = r10[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0523, code lost:
    
        if (r12 != null) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0525, code lost:
    
        r21 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x05fd, code lost:
    
        r11 = r11 + r6;
        r6 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x053c, code lost:
    
        if (r12.c(r12.f4797f) != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x053e, code lost:
    
        r12 = r10[r11];
        r14 = (H2.r0[]) r5[r8 - 1].f16841c;
        r13 = r5[r8 + 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x054d, code lost:
    
        if (r13 == null) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x054f, code lost:
    
        r13 = (H2.r0[]) r13.f16841c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0555, code lost:
    
        r21 = r6;
        r6 = new H2.r0[14];
        r6[2] = r14[r11];
        r6[3] = r13[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0568, code lost:
    
        if (r11 <= 0) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x056a, code lost:
    
        r19 = r11 - 1;
        r6[0] = r10[r19];
        r6[4] = r14[r19];
        r6[5] = r13[r19];
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0583, code lost:
    
        if (r11 <= 1) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0585, code lost:
    
        r28 = r11 - 2;
        r6[8] = r10[r28];
        r6[10] = r14[r28];
        r6[11] = r13[r28];
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x05a2, code lost:
    
        if (r11 >= (r10.length - 1)) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x05a4, code lost:
    
        r15 = r11 + 1;
        r6[1] = r10[r15];
        r6[6] = r14[r15];
        r6[7] = r13[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x05c0, code lost:
    
        if (r11 >= (r10.length - 2)) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x05c2, code lost:
    
        r15 = r11 + 2;
        r6[9] = r10[r15];
        r6[12] = r14[r15];
        r6[13] = r13[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x05d6, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x05d9, code lost:
    
        if (r13 >= 14) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x05db, code lost:
    
        r15 = r6[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x05dd, code lost:
    
        if (r15 != null) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x05df, code lost:
    
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x05f9, code lost:
    
        r13 = r13 + 1;
        r6 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x05e9, code lost:
    
        if (r15.c(r15.f4797f) == false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x05eb, code lost:
    
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x05f1, code lost:
    
        if (r15.f4795d != r12.f4795d) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x05f3, code lost:
    
        r12.f4797f = r15.f4797f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x05f7, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0554, code lost:
    
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0602, code lost:
    
        r8 = r8 + 1;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x04b1, code lost:
    
        r8 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x04b3, code lost:
    
        r12 = (H2.r0[]) r6.f16841c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x04b8, code lost:
    
        if (r8 >= r12.length) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x04ba, code lost:
    
        r12 = r12[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x04bc, code lost:
    
        if (r12 != null) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x04fd, code lost:
    
        r8 = r8 + 1;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x04c2, code lost:
    
        r12 = r12.f4797f;
        r14 = r7;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x04c6, code lost:
    
        if (r14 <= 0) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x04c9, code lost:
    
        if (r13 >= 2) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x04cb, code lost:
    
        r15 = ((H2.r0[]) r5[r14].f16841c)[r8];
        r21 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x04d5, code lost:
    
        if (r15 == null) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x04dd, code lost:
    
        if (r15.c(r15.f4797f) != false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x04e3, code lost:
    
        if (r15.c(r12) == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x04e5, code lost:
    
        r15.f4797f = r12;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x04e9, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x04f1, code lost:
    
        if (r15.c(r15.f4797f) != false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x04f3, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x04f9, code lost:
    
        r14 = r14 - 1;
        r6 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0465, code lost:
    
        r6 = 0;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0467, code lost:
    
        r12 = (H2.r0[]) r10.f16841c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x046c, code lost:
    
        if (r6 >= r12.length) goto L469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x046e, code lost:
    
        r12 = r12[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0470, code lost:
    
        if (r12 != null) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x04a9, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0474, code lost:
    
        r12 = r12.f4797f;
        r13 = 1;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0478, code lost:
    
        if (r13 >= r7) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x047b, code lost:
    
        if (r14 >= 2) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x047d, code lost:
    
        r15 = ((H2.r0[]) r5[r13].f16841c)[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0485, code lost:
    
        if (r15 == null) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x048d, code lost:
    
        if (r15.c(r15.f4797f) != false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0493, code lost:
    
        if (r15.c(r12) == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0495, code lost:
    
        r15.f4797f = r12;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0499, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x04a1, code lost:
    
        if (r15.c(r15.f4797f) != false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x04a3, code lost:
    
        r8 = 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x04a7, code lost:
    
        r13 = r13 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x04a6, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x026b, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x01f7, code lost:
    
        if (r14.f4797f != r10.f4797f) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0267, code lost:
    
        if (r9 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0269, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x026c, code lost:
    
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x026d, code lost:
    
        if (r12 > r7) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x026f, code lost:
    
        if (r9 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0271, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0277, code lost:
    
        if (r5[r13] == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0279, code lost:
    
        r18 = r0;
        r39 = r1;
        r38 = r3;
        r37 = r10;
        r21 = r11;
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x03c1, code lost:
    
        r12 = r12 + r1;
        r0 = r18;
        r11 = r21;
        r10 = r37;
        r3 = r38;
        r1 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0286, code lost:
    
        if (r13 == 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0288, code lost:
    
        if (r13 != r7) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x028d, code lost:
    
        r18 = r0;
        r0 = new ea.C1112g(r8);
        r20 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02a3, code lost:
    
        r5[r13] = r0;
        r21 = r11;
        r6 = -1;
        r41 = r20;
        r20 = r15;
        r15 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02ae, code lost:
    
        if (r11 > r10) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02b0, code lost:
    
        r37 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02b2, code lost:
    
        if (r9 == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02b4, code lost:
    
        r22 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02b9, code lost:
    
        r10 = r13 - r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02bb, code lost:
    
        if (r10 < 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02bd, code lost:
    
        r38 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02c3, code lost:
    
        if (r10 > (r2 + 1)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02c5, code lost:
    
        r3 = r5[r10];
        r39 = r1;
        r1 = ((H2.r0[]) r3.f16841c)[r3.i(r11)];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02dc, code lost:
    
        if (r1 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02de, code lost:
    
        if (r9 == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02e0, code lost:
    
        r1 = r1.f4794c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02e5, code lost:
    
        r40 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0360, code lost:
    
        if (r1 < 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0364, code lost:
    
        if (r1 <= r8.g) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x036d, code lost:
    
        r3 = i9.AbstractC1354f.c(r25, r8.f18469f, r8.g, r9, r1, r11, r20, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0385, code lost:
    
        if (r3 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x03a8, code lost:
    
        r20 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x03ab, code lost:
    
        r11 = r11 + 1;
        r10 = r37;
        r3 = r38;
        r1 = r39;
        r13 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0387, code lost:
    
        ((H2.r0[]) r0.f16841c)[r0.i(r11)] = r3;
        r6 = r3.f4794c;
        r3 = r3.f4793b;
        r10 = java.lang.Math.min(r20, r6 - r3);
        r3 = java.lang.Math.max(r15, r6 - r3);
        r6 = r1;
        r15 = r3;
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0367, code lost:
    
        if (r6 != (-1)) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x036c, code lost:
    
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02e3, code lost:
    
        r1 = r1.f4793b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02e9, code lost:
    
        r1 = r5[r13].h(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02ef, code lost:
    
        if (r1 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02f1, code lost:
    
        if (r9 == false) goto L139;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0792 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0238  */
    /* JADX WARN: Type inference failed for: r14v52, types: [V8.b, java.lang.Object] */
    @Override // P8.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n a(P8.b bVar, EnumMap enumMap) {
        char c10;
        s sVar;
        n nVar;
        r0 r0Var;
        C1350b c1350b;
        r0 k;
        u uVar;
        V8.b bVar2;
        int i7;
        int i10;
        int i11;
        char c11 = 1;
        ArrayList arrayList = new ArrayList();
        V8.b a9 = bVar.a();
        int[] iArr = AbstractC1434a.f19058e;
        int i12 = 0;
        while (true) {
            c10 = 4;
            if (i12 >= 4) {
                sVar = new s(0, a9, new ArrayList());
                break;
            }
            int i13 = iArr[i12];
            int i14 = i13 % 360;
            if (i14 == 0) {
                bVar2 = a9;
            } else {
                int i15 = a9.f10194a;
                int i16 = a9.f10195b;
                int i17 = a9.f10196c;
                int[] iArr2 = (int[]) a9.f10197d.clone();
                ?? obj = new Object();
                obj.f10194a = i15;
                obj.f10195b = i16;
                obj.f10196c = i17;
                obj.f10197d = iArr2;
                bVar2 = obj;
                if (i14 != 0) {
                    if (i14 == 90) {
                        obj.g();
                        bVar2 = obj;
                    } else if (i14 == 180) {
                        obj.f();
                        bVar2 = obj;
                    } else {
                        if (i14 != 270) {
                            throw new IllegalArgumentException("degrees must be a multiple of 0, 90, 180, or 270");
                        }
                        obj.g();
                        obj.f();
                        bVar2 = obj;
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int i18 = bVar2.f10195b;
            if (i18 > 0) {
                int i19 = bVar2.f10194a;
                p[] pVarArr = new p[8];
                p[] b2 = AbstractC1434a.b(bVar2, i18, i19, 0, 0, 10, AbstractC1434a.f19056c);
                int[] iArr3 = AbstractC1434a.f19054a;
                for (int i20 = 0; i20 < 4; i20++) {
                    pVarArr[iArr3[i20]] = b2[i20];
                }
                p pVar = pVarArr[4];
                if (pVar != null) {
                    int i21 = (int) pVar.f8249a;
                    int i22 = (int) pVar.f8250b;
                    if (pVarArr[5] != null) {
                        i10 = (int) Math.max((((int) r6.f8250b) - i22) * 0.5f, 10.0f);
                        i7 = i21;
                        i11 = i22;
                    } else {
                        i7 = i21;
                        i11 = i22;
                        i10 = 10;
                    }
                } else {
                    i7 = 0;
                    i10 = 10;
                    i11 = 0;
                }
                p[] b10 = AbstractC1434a.b(bVar2, i18, i19, i11, i7, i10, AbstractC1434a.f19057d);
                int[] iArr4 = AbstractC1434a.f19055b;
                for (int i23 = 0; i23 < 4; i23++) {
                    pVarArr[iArr4[i23]] = b10[i23];
                }
                if (pVarArr[0] != null || pVarArr[3] != null) {
                    arrayList2.add(pVarArr);
                }
            }
            if (!arrayList2.isEmpty()) {
                sVar = new s(i13, bVar2, arrayList2);
                break;
            }
            i12++;
        }
        Iterator it = ((ArrayList) sVar.f472c).iterator();
        while (it.hasNext()) {
            p[] pVarArr2 = (p[]) it.next();
            p pVar2 = pVarArr2[c10];
            p pVar3 = pVarArr2[5];
            p pVar4 = pVarArr2[6];
            p pVar5 = pVarArr2[7];
            int min = Math.min(Math.min(c(pVarArr2[0], pVar2), (c(pVarArr2[6], pVarArr2[2]) * 17) / 18), Math.min(c(pVarArr2[c11], pVarArr2[5]), (c(pVarArr2[7], pVarArr2[3]) * 17) / 18));
            int max = Math.max(Math.max(b(pVarArr2[0], pVarArr2[c10]), (b(pVarArr2[6], pVarArr2[2]) * 17) / 18), Math.max(b(pVarArr2[c11], pVarArr2[5]), (b(pVarArr2[7], pVarArr2[3]) * 17) / 18));
            R7.b bVar3 = AbstractC1354f.f18477a;
            V8.b bVar4 = (V8.b) sVar.f471b;
            C1350b c1350b2 = new C1350b(bVar4, pVar2, pVar3, pVar4, pVar5);
            r0 r0Var2 = null;
            char c12 = c11;
            C1352d c1352d = null;
            C1352d c1352d2 = null;
            while (true) {
                if (pVar2 != null) {
                    c1350b = c1350b2;
                    r0Var = r0Var2;
                    c1352d = AbstractC1354f.d(bVar4, c1350b2, pVar2, true, min, max);
                } else {
                    r0Var = r0Var2;
                    c1350b = c1350b2;
                }
                if (pVar4 != null) {
                    c1352d2 = AbstractC1354f.d(bVar4, c1350b, pVar4, false, min, max);
                }
                if (c1352d != null || c1352d2 != null) {
                    if (c1352d == null || (k = c1352d.k()) == null) {
                        if (c1352d2 != null) {
                            k = c1352d2.k();
                            if (k != null) {
                                C1350b a10 = AbstractC1354f.a(c1352d);
                                C1350b a11 = AbstractC1354f.a(c1352d2);
                                if (a10 == null) {
                                    a10 = a11;
                                } else if (a11 != null) {
                                    a10 = new C1350b(a10.f18464a, a10.f18465b, a10.f18466c, a11.f18467d, a11.f18468e);
                                }
                                uVar = new u(k, a10);
                                if (uVar != 0) {
                                    throw j.a();
                                }
                                C1350b c1350b3 = (C1350b) uVar.f21225e;
                                C1350b c1350b4 = c1350b;
                                int i24 = c1350b4.f18471i;
                                int i25 = c1350b4.f18470h;
                                if (c12 == 0 || c1350b3 == null || (c1350b3.f18470h >= i25 && c1350b3.f18471i <= i24)) {
                                    break;
                                }
                                c1350b2 = c1350b3;
                                r0Var2 = null;
                                c12 = 0;
                            }
                        }
                        k = r0Var;
                        if (k != null) {
                        }
                    } else {
                        if (c1352d2 != null) {
                            r0 k7 = c1352d2.k();
                            if (k7 != null) {
                                if (k.f4793b != k7.f4793b) {
                                    if (k.f4794c != k7.f4794c) {
                                    }
                                }
                            }
                        }
                        if (k != null) {
                        }
                    }
                }
                uVar = r0Var;
                if (uVar != 0) {
                }
            }
        }
        n[] nVarArr = (n[]) arrayList.toArray(f17895a);
        if (nVarArr.length == 0 || (nVar = nVarArr[0]) == null) {
            throw j.a();
        }
        return nVar;
    }

    @Override // P8.l
    public final void reset() {
    }
}
