package wa;

import A9.C0098j;
import A9.C0121o2;
import A9.C0151w1;
import Db.j;
import Db.o;
import Db.q;
import Eb.B;
import Eb.l;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.UtilsKt;
import com.kt.apps.media.xemtv.App;
import com.kt.apps.media.xemtv.beta.R;
import e7.AbstractC1097a;
import h3.C1247i;
import kotlin.jvm.internal.w;
import l2.AbstractC1456G;
import l2.U;
import y7.u0;
import y9.AbstractActivityC2461d;
import y9.AbstractC2456A;
import za.C2606e;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25838a;

    public /* synthetic */ f(int i7) {
        this.f25838a = i7;
    }

    private final Object b() {
        o oVar = AbstractActivityC2461d.f27489U;
        return q.f3365a;
    }

    private final Object c() {
        return AbstractC1097a.a();
    }

    private final Object d() {
        return new C0121o2();
    }

    private final Object e() {
        o oVar = AbstractC2456A.g2;
        return new Handler(Looper.getMainLooper());
    }

    private final Object g() {
        o oVar = AbstractC2456A.g2;
        return q.f3365a;
    }

    private final Object h() {
        o oVar = AbstractC2456A.g2;
        return Float.valueOf(UtilsKt.dpToPx(200));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Handler, y9.M, java.lang.Object] */
    private final Object i() {
        o oVar = AbstractC2456A.g2;
        ?? handler = new Handler(Looper.getMainLooper());
        handler.f27485a = null;
        return handler;
    }

    private final Object j() {
        o oVar = AbstractC2456A.g2;
        return new C0121o2();
    }

    private final Object k() {
        return new C0121o2();
    }

    private final Object l() {
        return new Object();
    }

    private final Object m() {
        return new l();
    }

    private final Object n() {
        return u0.y(5, 3, 4, 1);
    }

    private final Object o() {
        boolean z8 = C2606e.f28342J1;
        C0151w1 c0151w1 = new C0151w1();
        c0151w1.g = false;
        return new C0098j(c0151w1);
    }

    private final Object p() {
        boolean z8 = C2606e.f28342J1;
        App app = App.f16184z;
        if (app != null) {
            return app.getResources().getBoolean(R.bool.isBeta) ? B.H(new j(10994L, "Tìm kiếm"), new j(10992L, "Yêu thích"), new j(10999L, "Truyền hình"), new j(10998L, "Bóng đá"), new j(10995L, "IPTV"), new j(10993L, "Thông tin")) : B.H(new j(10994L, "Tìm kiếm"), new j(10992L, "Yêu thích"), new j(10999L, "Truyền hình"), new j(10995L, "IPTV"), new j(10993L, "Thông tin"));
        }
        kotlin.jvm.internal.l.j("app");
        throw null;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f25838a) {
            case 0:
                return new AbstractC1456G();
            case 1:
                return B.H(new j("thvl1-hd", "vinhlong1hd"), new j("thvl2-hd", "vinhlong2hd"), new j("thvl3-hd", "vinhlong3hd"), new j("thvl4-hd", "vinhlong4hd"), new j("vtv-can-tho", "vtv6"), new j("vtc2-reidius-tv", "vtc2"), new j("vtc16-hd", "vtc16"), new j("vtc4-yeah1-family-hd", "vtc4"), new j("vtc7-todaytv-hd", "vtc7|todaytv"), new j("vtc10-1", "vtc10"), new j("vtc11-kids-tv", "vtc11"), new j("htvc-du-lich-cuoc-song", "htvcdulichhd"), new j("htvc-du-lich-cuoc-song", "htvcdulichhd"), new j("an-giang-1", "angiang"), new j("bac-giang-hd", "bacgiang"), new j("bac-kan-1", "backan"), new j("bac-ninh-1", "bacninh"), new j("ben-tre-1-2", "bentre"), new j("binh-dinh", "binhdinh"), new j("binh-duong-1", "binhduong1"), new j("binh-duong-2", "binhduong2"), new j("binh-duong-4", "binhduong4"), new j("binh-phuoc-1", "binhphuoc1"), new j("binh-phuoc-2", "binhphuoc2"), new j("binh-thuan-1", "binh-thuan"), new j("ca-mau-1", "camau"), new j("can-tho-1", "cantho"), new j("dien-bien-20", "dienbien"), new j("dong-thap-1", "dongthap"), new j("gia-lai-1", "gialai"), new j("ha-giang-1", "hagiang"), new j("ha-nam-1", "hanam"), new j("ha-noi-2-2021", "hanoi2"), new j("ha-tinh-1", "hatinh"), new j("hai-phong-1", "haiphong"), new j("hau-giang-1", "haugiang"), new j("hoa-binh-1", "hoabinh"), new j("khanh-hoa-1", "khanhhoa"), new j("kon-tum-1", "kontum"), new j("lang-son-1", "langson"), new j("long-an-1", "longan"), new j("nghe-an-1", "nghean"), new j("ninh-binh-11", "ninhbinh"), new j("ninh-thuan-1", "ninhthuan"), new j("quang-binh-1", "quangbinh"), new j("quang-nam-1", "quangnam"), new j("quang-ngai-1", "quangngai"), new j("quang-ninh-1", "quangninh1"), new j("quang-ninh-3", "quangninh3"), new j("quang-tri-1", "quangtri"), new j("soc-trang-1", "soctrang"), new j("tay-ninh-3", "tayninh"), new j("thai-binh-1", "thaibinh"), new j("thai-nguyen-1", "thainguyen"), new j("thanh-hoa-48", "thanhhoa"), new j("thua-thien-hue-1", "hue"), new j("tien-giang-1", "tiengiang"), new j("tra-vinh-1", "travinh"), new j("tuyen-quang-1", "tuyenquang"), new j("vinh-phuc-1", "vinhphuc"), new j("ba-ria-vung-tau-1", "vungtau"), new j("yen-bai-1", "yenbai"), new j("nhan-dan-hd", "nhandan"), new j("quoc-hoi-viet-nam-hd", "quochoi"), new j("vnews-hd", "ttxvnhd"), new j("quoc-phong-hd", "qpvnhd"), new j("an-ninh-hd", "antvhd|antv"), new j("sctv1hd", "sctv1"), new j("sctv2hd", "sctv2"), new j("sctv3hd", "sctv3"), new j("sctv4hd", "sctv4"), new j("sctv5hd", "sctv5"), new j("sctv6hd", "sctv6"), new j("sctv7hd", "sctv7"), new j("sctv8hd", "sctv8"), new j("sctv9hd", "sctv9"), new j("sctv10hd", "sctv10"), new j("sctv11hd", "sctv11"), new j("sctv12hd", "sctv12"), new j("sctv13hd", "sctv13"), new j("sctv14hd", "sctv14"), new j("sctv15hd", "sctv15"), new j("sctv16hd", "sctv16"), new j("sctv17hd", "sctv17"), new j("sctv18hd", "sctv18"), new j("sctv19hd", "sctv19"), new j("sctv20hd", "sctv20"), new j("sctv21hd", "sctv21"), new j("sctv22hd", "sctv22"), new j("sctvhdpth", "sctvphim"));
            case 2:
                return B.H(new j("abcaustralia", "icon_channel_australia_plus_16564921977.png"), new j("angiang", "icon_channel_an_giang_165655813369.png"), new j("anninhtv", "icon_channel_antv_165655612485.png"), new j("asianfoodnetwork", "icon_channel_asian_food_channel_1656492213422.png"), new j("afn", "icon_channel_asian_food_channel_1656492213422.png"), new j("bàrịavũngtàu", "icon_channel_ba_ria_vung_tau_165655617345.png"), new j("bắcgiang", "icon_channel_bac_giang_165655615343.png"), new j("bắckạn", "icon_channel_bac_kan_165655814567.png"), new j("bạcliêu", "icon_channel_bac_lieu_16565581548.png"), new j("bắcninh", "icon_channel_bac_ninh_16565581667.png"), new j("bếntre", "icon_channel_ben_tre_166518804636.png"), new j("bìnhđịnh", "icon_channel_binh_dinh_165655818203.png"), new j("bìnhdương1", "icon_channel_binh_duong_1_165655622878.png"), new j("bìnhdương11", "icon_channel_btv_11_1656556391452.png"), new j("bìnhdương2", "icon_channel_binh_duong_2_165655623765.png"), new j("bìnhdương4", "icon_channel_imovie_hd_165656515084.png"), new j("bìnhdương6", "icon_channel_btv6_1656556375172.png"), new j("bìnhphước1", "icon_channel_binh_phuoc_1_165655621391.png"), new j("bìnhphước2", "icon_channel_hometv_bptv2_165655622154.png"), new j("bìnhthuận", "icon_channel_binh_thuan_165647570229.png"), new j("càmau", "icon_channel_ca_mau_165655821089.png"), new j("cầnthơ", "icon_channel_can_tho_165655892661.png"), new j("đànẵng1", "icon_channel_da_nang_1_1656492987662.png"), new j("đànẵng2", "icon_channel_da_nang_2_1656492995882.png"), new j("davinci", "icon_channel_da_vinci_learning_1656556593842.png"), new j("đắklắk", "icon_channel_dak_lak_165655700424.png"), new j("điệnbiên", "icon_channel_dien_bien_1656558226232.png"), new j("đồngnai1", "icon_channel_dongnai1.png"), new j("đồngnai2", "icon_channel_dongnai2.png"), new j("đồngtháp1", "icon_channel_dong_thap_165655753932.png"), new j("đồngtháp2", "icon_channel_mien_tay_thdt2_1656669937382.png"), new j("dw", "icon_channel_dw_1656492345412.png"), new j("france24english", "icon_channel_france_24_1656493080452.png"), new j("gialai", "icon_channel_gia_lai_1656558891032.png"), new j("hàgiang", "icon_channel_ha_giang_165647603612.png"), new j("hànam", "icon_channel_ha_nam_165655890147.png"), new j("hànội1", "icon_channel_hanoi1.png"), new j("hàtĩnh", "icon_channel_ha_tinh_1656558262372.png"), new j("hậugiang", "icon_channel_hau_giang_165655824967.png"), new j("hòabình", "icon_channel_hoa_binh_1656557056552.png"), new j("htvkey", "icon_channel_htv4_1656476700552.png"), new j("htvthểthao", "icon_channel_htvc_the_thao_1656493154832.png"), new j("htv1", "icon_channel_htv1_1656557069452.png"), new j("htv2", "icon_channel_htv2_165657612334.png"), new j("htv3", "icon_channel_htv3_1656558279912.png"), new j("htv7", "icon_channel_htv7_hd_16565582880.png"), new j("htv9", "icon_channel_htv9_hd_165655829886.png"), new j("htvccanhạc", "icon_channel_htvc_ca_nhac_1656493098162.png"), new j("htvcdulịchcuộcsống", "icon_channel_htvc_du_lich_1656493038942.png"), new j("htvcgiađình", "icon_channel_htvc_gia_dinh_1656493090842.png"), new j("htvcmuasắmtiêudùng", "icon_channel_htvc_shopping_1656493140532.png"), new j("htvcphim", "icon_channel_htvc_phim_1656493107552.png"), new j("htvcphụnữ", "icon_channel_htvc_phu_nu_1656493249982.png"), new j("htvcthuầnviệt", "icon_channel_htvc_thuan_viet_hd_1656478671262.png"), new j("htvc+", "icon_channel_htvc_plus_1656576133242.png"), new j("kbsworld", "icon_channel_kbs_world_1656557264112.png"), new j("khánhhòa", "icon_channel_khanh_hoa_1656558313512.png"), new j("kix", "icon_channel_kix_165649318532.png"), new j("kontum", "icon_channel_kon_tum_1656558326972.png"), new j("lâmđồng", "icon_channel_lam_dong_1656492399292.png"), new j("lạngsơn", "icon_channel_lang_son_1656585276672.png"), new j("longan", "icon_channel_long_an_1656558338422.png"), new j("namđịnh", "icon_channel_nam_dinh_1656557300672.png"), new j("nghệan", "icon_channel_nghe_an_1656493226672.png"), new j("nhândântv", "icon_channel_truyen_hinh_nhan_dan_165655731781.png"), new j("nhkworld", "icon_channel_nhk_world_hd_1656557328232.png"), new j("ninhbình", "icon_channel_ninh_binh_165649260222.png"), new j("ninhthuận", "icon_channel_ninh_thuan_1656557352692.png"), new j("outdoorchannel", "icon_channel_outdoor_channel_1656493235452.png"), new j("quảngbình", "icon_channel_quang_binh_tv_1656558608352.png"), new j("quảngnam", "icon_channel_quang_nam_1656492517622.png"), new j("quảngngãi", "icon_channel_quang_ngai_165655742091.png"), new j("quảngninh1", "icon_channel_quang_ninh_1_165655862222.png"), new j("quảngninh3", "icon_channel_quang_ninh_3_1656560399132.png"), new j("quảngtrị", "icon_channel_quang_tri_1656478574822.png"), new j("quốchội", "icon_channel_quoc_hoi_hd_165656647452.png"), new j("quốcphòng", "icon_channel_quoc_phong_vn_165647856201.png"), new j("sóctrăng", "icon_channel_soc_trang_165656082452.png"), new j("tâyninh", "icon_channel_tay_ninh_hd_1656478594032.png"), new j("ththôngtấn", "icon_channel_thong_tan_xa_viet_nam_165649329873.png"), new j("tháibình", "icon_channel_thai_binh_1656478612362.png"), new j("tháinguyên", "icon_channel_thai_nguyen_1656557523932.png"), new j("thanhhóa", "icon_channel_thanh_hoa_1656570355912.png"), new j("thừathiênhuế", "icon_channel_thua_thien_hue_1656558944262.png"), new j("tiềngiang", "icon_channel_tien_giang_1656557556552.png"), new j("tràvinh", "icon_channel_tra_vinh_1656557568522.png"), new j("tuyênquang", "icon_channel_tuyen_quang_1656560417792.png"), new j("vĩnhlong1", "icon_channel_thvl1_165657384745.png"), new j("vĩnhlong2", "icon_channel_vinh_long_2_1656573856152.png"), new j("vĩnhlong3", "icon_channel_vinh_long_3_1656573863882.png"), new j("vĩnhlong4", "icon_channel_vinh_long_4_hd_1656573877542.png"), new j("vinhlong1", "icon_channel_thvl1_165657384745.png"), new j("vinhlong2", "icon_channel_vinh_long_2_1656573856152.png"), new j("vinhlong3", "icon_channel_vinh_long_3_1656573863882.png"), new j("vinhlong4", "icon_channel_vinh_long_4_hd_1656573877542.png"), new j("thvl1", "icon_channel_thvl1_165657384745.png"), new j("thvl2", "icon_channel_vinh_long_2_1656573856152.png"), new j("thvl3", "icon_channel_vinh_long_3_1656573863882.png"), new j("thvl4", "icon_channel_vinh_long_4_hd_1656573877542.png"), new j("vĩnhphúc", "icon_channel_vinh_phuc_1656492619662.png"), new j("vtc1", "icon_channel_vtc1_1656493309872.png"), new j("vtc10", "icon_channel_vtc10_166706321017.jpg"), new j("vtc11", "icon_channel_vtc11_thieu_nhi_1656494361482.png"), new j("vtc12", "icon_channel_vtc12_165649436922.png"), new j("vtc13", "icon_channel_vtc13_hd_1656493465022.png"), new j("vtc14", "icon_channel_vtc14_hd_1656493581722.png"), new j("vtc16", "icon_channel_vtc16_1656493594572.png"), new j("vtc2", "icon_channel_vtc2_1656493319822.png"), new j("vtc3", "icon_channel_vtc3_hd_1656493328642.png"), new j("vtc4", "icon_channel_yeah1_family_vtc4_1656496937772.png"), new j("vtc5", "icon_channel_vtc5_1656496946342.png"), new j("vtc6", "icon_channel_vtc6_1656494338272.png"), new j("vtc7", "icon_channel_todaytv_vtc7_1656496956272.png"), new j("vtc8", "icon_channel_vtc8_1656494345432.png"), new j("vtc9", "icon_channel_vtc9_1656493473382.png"), new j("vtvcầnthơ", "icon_channel_vtv_can_tho_166537074507.jpg"), new j("vtv6", "icon_channel_vtv_can_tho_166537074507.jpg"), new j("vtv1", "icon_channel_vtv1_hd_165657381026.png"), new j("vtv2", "icon_channel_vtv2_hd_16565576783.png"), new j("vtv3", "icon_channel_vtv3_hd_165657381668.png"), new j("vtv4", "icon_channel_vtv4_hd_165657382285.png"), new j("vtv5", "icon_channel_vtv5_hd_165657382858.png"), new j("vtv5tn", "icon_channel_vtv5_tn.png"), new j("vtv5hdtn", "icon_channel_vtv5_tn.png"), new j("vtv5tnb", "icon_channel_vtv5_tnb.png"), new j("vtv5hdtnb", "icon_channel_vtv5_tnb.png"), new j("vtv7", "icon_channel_vtv7_hd_165655773646.png"), new j("vtv8", "icon_channel_vtv8_hd_165657496167.png"), new j("vtv9", "icon_channel_vtv9_hd_165657032671.png"), new j("yênbái", "icon_channel_yen_bai_1656559097542.png"), new j("vovfm89", "icon_channel_vov_suckhoe.png"), new j("vovgiaothônghànội", "icon_channel_vov_giaothong.png"), new j("vovgiaothônghcm", "icon_channel_vov_giaothong.png"), new j("vovmekong", "icon_channel_vov_mekong.png"), new j("vov1", "icon_channel_vov1.png"), new j("vov2", "icon_channel_vov2.png"), new j("vov3", "icon_channel_vov3.png"), new j("vovtv", "icon_channel_vovtv_161070256824.jpg"), new j("vov4đồngbằngsôngcửulong", "icon_channel_vov_dbscl.png"), new j("vov4hồchíminh", "icon_channel_vov_hcm.png"), new j("vov4miềntrung", "icon_channel_vov_mientrung.png"), new j("vov4tâybắc", "icon_channel_vov_taybac.png"), new j("vov4đôngbắc", "icon_channel_vov_dongbac.png"), new j("vov4tâynguyên", "icon_channel_vov_taynguyen.png"), new j("vov5", "icon_channel_vov5.png"), new j("vov5chinese", "icon_channel_vov5.png"), new j("vov5english247", "icon_channel_vov5.png"), new j("vov5french", "icon_channel_vov5.png"), new j("vov5german", "icon_channel_vov5.png"), new j("vov5indonesian", "icon_channel_vov5.png"), new j("vov5japanese", "icon_channel_vov5.png"), new j("vov5khmer", "icon_channel_vov5.png"), new j("vov5laotian", "icon_channel_vov5.png"), new j("vov5russian", "icon_channel_vov5.png"), new j("vov5spanish", "icon_channel_vov5.png"), new j("vov5thailand", "icon_channel_vov5.png"), new j("vov6internationalsvc", "icon_channel_vov6.png"), new j("fm877mhz", "icon_channel_voh.png"), new j("fm956mhz", "icon_channel_voh.png"), new j("fm999mhz", "icon_channel_voh.png"), new j("am610khz", "icon_channel_voh.png"), new j("hànội2", "icon_channel_hanoi2.png"), new j("đồngnai3", "icon_channel_dongnai3.png"), new j("đắknông", "icon_channel_daknong.png"), new j("anviên", "icon_channel_anvien.png"), new j("htvcoop", "icon_channel_htv_coop.png"), new j("vtvcab2hd", "icon_channel_vtvcab_phimviet7_1675158872.webp"), new j("oncine1", "icon_channel_vtvcab_oncine1_1675158860.webp"), new j("vtvcaboncine1", "icon_channel_vtvcab_oncine1_1675158860.webp"), new j("ongold", "icon_channel_vtvcab_on_gold1_1675158871.webp"), new j("vtvcabongold", "icon_channel_vtvcab_on_gold1_1675158871.webp"), new j("onbibi", "icon_channel_vtvcab_onbibi1_1675158864.webp"), new j("tvtcabonbibi", "icon_channel_vtvcab_onbibi1_1675158864.webp"), new j("youtv", "icon_channel_youtv_162952854632.jpg"), new j("sctv1", "icon_channel_sctv1.webp"), new j("sctv2", "icon_channel_sctv2"), new j("sctv3", "icon_channel_sctv3"), new j("sctv4", "icon_channel_sctv4"), new j("sctv5", "icon_channel_sctv5"), new j("sctv6", "icon_channel_sctv6"), new j("sctv7", "icon_channel_sctv7"), new j("sctv8", "icon_channel_sctv8"), new j("sctv9", "icon_channel_sctv9"), new j("sctv10", "icon_channel_sctv10"), new j("sctv11", "icon_channel_sctv11"), new j("sctv12", "icon_channel_sctv12"), new j("sctv13", "icon_channel_sctv13"), new j("sctv14", "icon_channel_sctv14"), new j("sctv15", "icon_channel_sctv15"), new j("sctv17", "icon_channel_sctv17"), new j("sctv18", "icon_channel_sctv18"), new j("sctv19", "icon_channel_sctv19"), new j("sctv20", "icon_channel_sctv20"), new j("sctv21", "icon_channel_sctv21"), new j("sctv22", "icon_channel_sctv22"), new j("sctvpth", "icon_channel_sctvphim.webp"), new j("sctvphim", "icon_channel_sctvphim.webp"), new j("sctvphimtonghop", "icon_channel_sctvphim.webp"), new j("quochoi", "icon_channel_quoc_hoi_hd_165656647452.png"), new j("antv", "icon_channel_antv_165655612485.png"), new j("quocphong", "icon_channel_quoc_phong_vn_165647856201.png"), new j("quocphongvn", "icon_channel_quoc_phong_vn_165647856201.png"), new j("qpvn", "icon_channel_quoc_phong_vn_165647856201.png"), new j("nhandan", "icon_channel_truyen_hinh_nhan_dan_165655731781.png"), new j("nhandantv", "icon_channel_truyen_hinh_nhan_dan_165655731781.png"), new j("ndtv", "icon_channel_truyen_hinh_nhan_dan_165655731781.png"), new j("animax", "icon_channel_animax_165647567355.png"), new j("animalplanet", "icon_channel_animal_planet_1656492721972.png"), new j("animal", "icon_channel_animal_planet_1656492721972.png"), new j("animeclassio", "icon_channel_animeclassio.jpeg"), new j("anvien", "icon_channel_anvien.png"), new j("arirang", "icon_channel_arirang_15148903242.png"), new j("ariang", "icon_channel_arirang_15148903242.png"), new j("asianfood", "icon_channel_asian_food_channel_1656492213422.png"), new j("anx", "icon_channel_axn.webp"), new j("babyfirst", "icon_channel_baby_first_152332783386.png"), new j("babytv", "icon_channel_babytv.png"), new j("bbcearth", "icon_channel_bbc_earth_148379672898.jpg"), new j("bbclife", "icon_channel_bbc_lifestyle_148379742953.jpg"), new j("bbclifestyle", "icon_channel_bbc_lifestyle_148379742953.jpg"), new j("bbcnews", "icon_channel_bbc_news_156325644439.webp"), new j("bbcnew", "icon_channel_bbc_news_156325644439.webp"), new j("bloomberg", "icon_channel_bloomberg_146581277148.png"), new j("blueantentertainment", "icon_channel_blue_ant_entertainment_165649225527.png"), new j("blueantextreme", "icon_channel_blue_ant_extreme_165649226345.png"), new j("extreme", "icon_channel_blue_ant_extreme_165649226345.png"), new j("blueantext", "icon_channel_blueantext.jpg"), new j("blueantent", "icon_channel_blueantent.jpg"), new j("bongdaviet", "icon_channel_bongdaviet.png"), new j("bóngđáviệt", "icon_channel_bongdaviet.png"), new j("boomerang", "icon_channel_boomerang_152240335127.png"), new j("cartoonnetwork", "icon_channel_cartoon_network_165649227684.png"), new j("cartoonnw", "icon_channel_cartoon_network_165649227684.png"), new j("cbeebies", "icon_channel_cbeebies.jpeg"), new j("bbccbeebies", "icon_channel_cbeebies.jpeg"), new j("cinemaworld", "icon_channel_cinemaworld_165647572623.png"), new j("cnn", "icon_channel_cnn_146581309815.png"), new j("contv", "icon_channel_contv.jpeg"), new j("con", "icon_channel_contv.jpeg"), new j("davincilearning", "icon_channel_da_vinci_learning_1656556593842.png"), new j("davinci", "icon_channel_da_vinci_learning_1656556593842.png"), new j("discovery", "icon_channel_discovery_157259072379.png"), new j("discoveryasia", "icon_channel_discovery_asia_152332466749.png"), com.bumptech.glide.d.x("discoverya", "icon_channel_discovery_asia_152332466749.png"), com.bumptech.glide.d.x("dreamworks", "icon_channel_dreamworks.png"), com.bumptech.glide.d.x("drfit", "icon_channel_drfit.webp"), com.bumptech.glide.d.x("dw", "icon_channel_dw_1656492345412.png"), com.bumptech.glide.d.x("fashion", "icon_channel_fashion_tv_165649235825.png"), com.bumptech.glide.d.x("fashiontv", "icon_channel_fashion_tv_165649235825.png"), com.bumptech.glide.d.x("film360", "icon_channel_fim360_163298589919.jpg"), com.bumptech.glide.d.x("phim360", "icon_channel_fim360_163298589919.jpg"), com.bumptech.glide.d.x("360film", "icon_channel_fim360_163298589919.jpg"), com.bumptech.glide.d.x("360phim", "icon_channel_fim360_163298589919.jpg"), com.bumptech.glide.d.x("360phimtruyen", "icon_channel_fim360_163298589919.jpg"), com.bumptech.glide.d.x("france24", "icon_channel_france_24_1656493080452.png"), com.bumptech.glide.d.x("happykids", "icon_channel_happykids.jpeg"), com.bumptech.glide.d.x("hbo", "icon_channel_hbo_165647605697.png"), com.bumptech.glide.d.x("hollywoodclassics", "icon_channel_holllywoodclassics.webp"), com.bumptech.glide.d.x("imovie", "icon_channel_imovie_hd_165656515084.png"), com.bumptech.glide.d.x("kbsworld", "icon_channel_kbs_world_1656557264112.png"), com.bumptech.glide.d.x("kbs", "icon_channel_kbs_world_1656557264112.png"), com.bumptech.glide.d.x("kns", "icon_channel_kns_165655713016.png"), com.bumptech.glide.d.x("channelnewsasia", "icon_channel_channel_newsasia_1656492950912.png"), com.bumptech.glide.d.x("newsasia", "icon_channel_channel_newsasia_1656492950912.png"), com.bumptech.glide.d.x("cna", "icon_channel_channel_newsasia_1656492950912.png"), com.bumptech.glide.d.x("cnbc", "icon_channel_cnbc_1656492959472.png"));
            case 3:
                return new ac.e("(https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\\.[^\\s]{2,}|www\\.[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\\.[^\\s]{2,}|https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9]+\\.[^\\s]{2,}|www\\.[a-zA-Z0-9]+\\.[^\\s]{2,})");
            case 4:
                C0151w1 c0151w1 = new C0151w1();
                c0151w1.g = false;
                return new C0098j(c0151w1);
            case 5:
                return new AbstractC1456G();
            case 6:
                return new AbstractC1456G();
            case 7:
                return new U();
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                C1247i c1247i = new C1247i(1);
                c1247i.a(w.a(y2.b.class), new Ba.i(23));
                return c1247i.b();
            case 9:
                return new Object();
            case 10:
                return B.H(new j(7, 0), new j(8, 1), new j(9, 2), new j(10, 3), new j(11, 4), new j(12, 5), new j(13, 6), new j(14, 7), new j(15, 8), new j(16, 9));
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return b();
            case 12:
                return c();
            case 13:
                return d();
            case 14:
                return e();
            case 15:
                return g();
            case 16:
                return h();
            case 17:
                return i();
            case 18:
                return j();
            case 19:
                return k();
            case 20:
                return l();
            case 21:
                return m();
            case 22:
                return n();
            case 23:
                return o();
            case 24:
                return p();
            default:
                boolean z8 = C2606e.f28342J1;
                return B.H(new j(10994L, Integer.valueOf(R.drawable.ic_search_24p)), new j(10992L, Integer.valueOf(R.drawable.ic_round_bookmark_border_24)), new j(10999L, Integer.valueOf(R.drawable.ic_tv)), new j(10998L, Integer.valueOf(R.drawable.ic_soccer_ball)), new j(10997L, Integer.valueOf(R.drawable.ic_radio)), new j(10996L, Integer.valueOf(R.drawable.round_add_circle_outline_24)), new j(10995L, Integer.valueOf(R.drawable.iptv)), new j(10993L, Integer.valueOf(R.drawable.ic_outline_info_24)));
        }
    }
}
