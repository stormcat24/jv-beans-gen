/*
 * Copyright 2009-2010 the Stormcat Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.stormcat.jvbeans.gen.format.xls;

import java.util.List;

import org.stormcat.jvbeans.gen.annotation.MappedRecordTypeId;


import net.java.amateras.xlsbeans.annotation.HorizontalRecords;
import net.java.amateras.xlsbeans.annotation.RecordTerminal;
import net.java.amateras.xlsbeans.annotation.Sheet;

/**
 * @author a.yamada
 *
 */
@Sheet(name = "フォーマット")
public class FormatSheet {

    @MappedRecordTypeId("TK")
    private List<FormatRow> tokubetuTourokubaItems;
    
    @MappedRecordTypeId("RA")
    private List<FormatRow> raceDetailItems;
    
    @MappedRecordTypeId("SE")
    private List<FormatRow> raceInfoHorseItems;
    
    @MappedRecordTypeId("HR")
    private List<FormatRow> haraimodoshiItems;
    
    @MappedRecordTypeId("H1")
    private List<FormatRow> hyosu1Items;
    
    @MappedRecordTypeId("H6")
    private List<FormatRow> hyosu6Items;
    
    @MappedRecordTypeId("O1")
    private List<FormatRow> odds1Items;
    
    @MappedRecordTypeId("O2")
    private List<FormatRow> odds2Items;
    
    @MappedRecordTypeId("O3")
    private List<FormatRow> odds3Items;
    
    @MappedRecordTypeId("O4")
    private List<FormatRow> odds4Items;
    
    @MappedRecordTypeId("O5")
    private List<FormatRow> odds5Items;
    
    @MappedRecordTypeId("O6")
    private List<FormatRow> odds6Items;
    
    @MappedRecordTypeId("UM")
    private List<FormatRow> kyosobaMasterItems;
    
    @MappedRecordTypeId("KS")
    private List<FormatRow> kisyuMasterItems;
    
    @MappedRecordTypeId("CH")
    private List<FormatRow> chokyoshiMasterItems;
    
    @MappedRecordTypeId("BR")
    private List<FormatRow> seisansyaMasterItems;
    
    @MappedRecordTypeId("BN")
    private List<FormatRow> umanushiMasterItems;
    
    @MappedRecordTypeId("HN")
    private List<FormatRow> hansyokubaMasterItems;
    
    @MappedRecordTypeId("SK")
    private List<FormatRow> sankuMasterItems;
    
    @MappedRecordTypeId("CK")
    private List<FormatRow> syussobetsuChakudosuItems;
    
    @MappedRecordTypeId("RC")
    private List<FormatRow> recordMasterIems;
    
    @MappedRecordTypeId("HC")
    private List<FormatRow> hanroChokyoItems;
    
    @MappedRecordTypeId("HS")
    private List<FormatRow> kyosobaShijoTorihikikakakuItems;
    
    @MappedRecordTypeId("HY")
    private List<FormatRow> bameiImiYuraiItems;
    
    @MappedRecordTypeId("YS")
    private List<FormatRow> kaisaiScheduleItems;
    
    @MappedRecordTypeId("BT")
    private List<FormatRow> keitoInfoItems;
    
    @MappedRecordTypeId("CS")
    private List<FormatRow> courseInfoItems;
    
    @MappedRecordTypeId("DM")
    private List<FormatRow> dataMiningYosoItems;
    
    @MappedRecordTypeId("WH")
    private List<FormatRow> bataizyuItems;
    
    @MappedRecordTypeId("WE")
    private List<FormatRow> tenkoBabazyotaiItems;
    
    @MappedRecordTypeId("AV")
    private List<FormatRow> syussotorikeshiKyosozyogaiItems;
    
    @MappedRecordTypeId("JC")
    private List<FormatRow> kisyuHenkoItems;
    
    @MappedRecordTypeId("TC")
    private List<FormatRow> hassoJikokuHenkoItems;
    
    @MappedRecordTypeId("CC")
    private List<FormatRow> courseHenkoItems;

    /**
     * @return tokubetuTourokubaItems
     */
    public List<FormatRow> getTokubetuTourokubaItems() {
        return tokubetuTourokubaItems;
    }

    /**
     * @param tokubetuTourokubaItems セットする tokubetuTourokubaItems
     */
    @HorizontalRecords(tableLabel = "１．特別登録馬", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setTokubetuTourokubaItems(List<FormatRow> tokubetuTourokubaItems) {
        this.tokubetuTourokubaItems = tokubetuTourokubaItems;
    }

    /**
     * @return raceDetailItems
     */
    public List<FormatRow> getRaceDetailItems() {
        return raceDetailItems;
    }

    /**
     * @param raceDetailItems セットする raceDetailItems
     */
    @HorizontalRecords(tableLabel = "２．レース詳細", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setRaceDetailItems(List<FormatRow> raceDetailItems) {
        this.raceDetailItems = raceDetailItems;
    }

    /**
     * @return raceInfoHorseItems
     */
    public List<FormatRow> getRaceInfoHorseItems() {
        return raceInfoHorseItems;
    }

    /**
     * @param raceInfoHorseItems セットする raceInfoHorseItems
     */
    @HorizontalRecords(tableLabel = "３．馬毎レース情報", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setRaceInfoHorseItems(List<FormatRow> raceInfoHorseItems) {
        this.raceInfoHorseItems = raceInfoHorseItems;
    }

    /**
     * @return haraimodoshiItems
     */
    public List<FormatRow> getHaraimodoshiItems() {
        return haraimodoshiItems;
    }

    /**
     * @param haraimodoshiItems セットする haraimodoshiItems
     */
    @HorizontalRecords(tableLabel = "４．払戻", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setHaraimodoshiItems(List<FormatRow> haraimodoshiItems) {
        this.haraimodoshiItems = haraimodoshiItems;
    }

    /**
     * @return hyosu1Items
     */
    public List<FormatRow> getHyosu1Items() {
        return hyosu1Items;
    }

    /**
     * @param hyosu1Items セットする hyosu1Items
     */
    @HorizontalRecords(tableLabel = "５．票数１", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setHyosu1Items(List<FormatRow> hyosu1Items) {
        this.hyosu1Items = hyosu1Items;
    }

    /**
     * @return hyosu6Items
     */
    public List<FormatRow> getHyosu6Items() {
        return hyosu6Items;
    }

    /**
     * @param hyosu6Items セットする hyosu6Items
     */
    @HorizontalRecords(tableLabel = "６．票数6（3連単）", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setHyosu6Items(List<FormatRow> hyosu6Items) {
        this.hyosu6Items = hyosu6Items;
    }

    /**
     * @return odds1Items
     */
    public List<FormatRow> getOdds1Items() {
        return odds1Items;
    }

    /**
     * @param odds1Items セットする odds1Items
     */
    @HorizontalRecords(tableLabel = "７．オッズ1（単複枠）", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setOdds1Items(List<FormatRow> odds1Items) {
        this.odds1Items = odds1Items;
    }

    /**
     * @return odds2Items
     */
    public List<FormatRow> getOdds2Items() {
        return odds2Items;
    }

    /**
     * @param odds2Items セットする odds2Items
     */
    @HorizontalRecords(tableLabel = "８．オッズ2（馬連）", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setOdds2Items(List<FormatRow> odds2Items) {
        this.odds2Items = odds2Items;
    }

    /**
     * @return odds3Items
     */
    public List<FormatRow> getOdds3Items() {
        return odds3Items;
    }

    /**
     * @param odds3Items セットする odds3Items
     */
    @HorizontalRecords(tableLabel = "９．オッズ3（ワイド）", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setOdds3Items(List<FormatRow> odds3Items) {
        this.odds3Items = odds3Items;
    }

    /**
     * @return odds4Items
     */
    public List<FormatRow> getOdds4Items() {
        return odds4Items;
    }

    /**
     * @param odds4Items セットする odds4Items
     */
    @HorizontalRecords(tableLabel = "１０．オッズ4（馬単）", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setOdds4Items(List<FormatRow> odds4Items) {
        this.odds4Items = odds4Items;
    }

    /**
     * @return odds5Items
     */
    public List<FormatRow> getOdds5Items() {
        return odds5Items;
    }

    /**
     * @param odds5Items セットする odds5Items
     */
    @HorizontalRecords(tableLabel = "１１．オッズ5（3連複）", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setOdds5Items(List<FormatRow> odds5Items) {
        this.odds5Items = odds5Items;
    }

    /**
     * @return odds6Items
     */
    public List<FormatRow> getOdds6Items() {
        return odds6Items;
    }

    /**
     * @param odds6Items セットする odds6Items
     */
    @HorizontalRecords(tableLabel = "１２．オッズ6（3連単）", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setOdds6Items(List<FormatRow> odds6Items) {
        this.odds6Items = odds6Items;
    }

    /**
     * @return kyosobaMasterItems
     */
    
    public List<FormatRow> getKyosobaMasterItems() {
        return kyosobaMasterItems;
    }

    /**
     * @param kyosobaMasterItems セットする kyosobaMasterItems
     */
    @HorizontalRecords(tableLabel = "１３．競走馬マスタ", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setKyosobaMasterItems(List<FormatRow> kyosobaMasterItems) {
        this.kyosobaMasterItems = kyosobaMasterItems;
    }

    /**
     * @return kisyuMasterItems
     */
    public List<FormatRow> getKisyuMasterItems() {
        return kisyuMasterItems;
    }

    /**
     * @param kisyuMasterItems セットする kisyuMasterItems
     */
    @HorizontalRecords(tableLabel = "１４．騎手マスタ", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setKisyuMasterItems(List<FormatRow> kisyuMasterItems) {
        this.kisyuMasterItems = kisyuMasterItems;
    }

    /**
     * @return chokyoshiMasterItems
     */
    public List<FormatRow> getChokyoshiMasterItems() {
        return chokyoshiMasterItems;
    }

    /**
     * @param chokyoshiMasterItems セットする chokyoshiMasterItems
     */
    @HorizontalRecords(tableLabel = "１５．調教師マスタ", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setChokyoshiMasterItems(List<FormatRow> chokyoshiMasterItems) {
        this.chokyoshiMasterItems = chokyoshiMasterItems;
    }

    /**
     * @return seisansyaMasterItems
     */
    public List<FormatRow> getSeisansyaMasterItems() {
        return seisansyaMasterItems;
    }

    /**
     * @param seisansyaMasterItems セットする seisansyaMasterItems
     */
    @HorizontalRecords(tableLabel = "１６．生産者マスタ", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setSeisansyaMasterItems(List<FormatRow> seisansyaMasterItems) {
        this.seisansyaMasterItems = seisansyaMasterItems;
    }

    /**
     * @return umanushiMasterItems
     */
    public List<FormatRow> getUmanushiMasterItems() {
        return umanushiMasterItems;
    }

    /**
     * @param umanushiMasterItems セットする umanushiMasterItems
     */
    @HorizontalRecords(tableLabel = "１７．馬主マスタ", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setUmanushiMasterItems(List<FormatRow> umanushiMasterItems) {
        this.umanushiMasterItems = umanushiMasterItems;
    }

    /**
     * @return hansyokubaMasterItems
     */
    public List<FormatRow> getHansyokubaMasterItems() {
        return hansyokubaMasterItems;
    }

    /**
     * @param hansyokubaMasterItems セットする hansyokubaMasterItems
     */
    @HorizontalRecords(tableLabel = "１８．繁殖馬マスタ", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setHansyokubaMasterItems(List<FormatRow> hansyokubaMasterItems) {
        this.hansyokubaMasterItems = hansyokubaMasterItems;
    }

    /**
     * @return sankuMasterItems
     */
    public List<FormatRow> getSankuMasterItems() {
        return sankuMasterItems;
    }

    /**
     * @param sankuMasterItems セットする sankuMasterItems
     */
    @HorizontalRecords(tableLabel = "１９．産駒マスタ", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setSankuMasterItems(List<FormatRow> sankuMasterItems) {
        this.sankuMasterItems = sankuMasterItems;
    }

    /**
     * @return syussobetsuChakudosuItems
     */
    public List<FormatRow> getSyussobetsuChakudosuItems() {
        return syussobetsuChakudosuItems;
    }

    /**
     * @param syussobetsuChakudosuItems セットする syussobetsuChakudosuItems
     */
    @HorizontalRecords(tableLabel = "２０．出走別着度数", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setSyussobetsuChakudosuItems(List<FormatRow> syussobetsuChakudosuItems) {
        this.syussobetsuChakudosuItems = syussobetsuChakudosuItems;
    }

    /**
     * @return recordMasterIems
     */
    public List<FormatRow> getRecordMasterIems() {
        return recordMasterIems;
    }

    /**
     * @param recordMasterIems セットする recordMasterIems
     */
    @HorizontalRecords(tableLabel = "２１．レコードマスタ", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setRecordMasterIems(List<FormatRow> recordMasterIems) {
        this.recordMasterIems = recordMasterIems;
    }

    /**
     * @return hanroChokyoItems
     */
    public List<FormatRow> getHanroChokyoItems() {
        return hanroChokyoItems;
    }

    /**
     * @param hanroChokyoItems セットする hanroChokyoItems
     */
    @HorizontalRecords(tableLabel = "２２．坂路調教", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setHanroChokyoItems(List<FormatRow> hanroChokyoItems) {
        this.hanroChokyoItems = hanroChokyoItems;
    }

    /**
     * @return kyosobaShijoTorihikikakakuItems
     */
    public List<FormatRow> getKyosobaShijoTorihikikakakuItems() {
        return kyosobaShijoTorihikikakakuItems;
    }

    /**
     * @param kyosobaShijoTorihikikakakuItems セットする kyosobaShijoTorihikikakakuItems
     */
    @HorizontalRecords(tableLabel = "２３．競走馬市場取引価格", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setKyosobaShijoTorihikikakakuItems(List<FormatRow> kyosobaShijoTorihikikakakuItems) {
        this.kyosobaShijoTorihikikakakuItems = kyosobaShijoTorihikikakakuItems;
    }

    /**
     * @return bameiImiYuraiItems
     */
    public List<FormatRow> getBameiImiYuraiItems() {
        return bameiImiYuraiItems;
    }

    /**
     * @param bameiImiYuraiItems セットする bameiImiYuraiItems
     */
    @HorizontalRecords(tableLabel = "２４．馬名の意味由来", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setBameiImiYuraiItems(List<FormatRow> bameiImiYuraiItems) {
        this.bameiImiYuraiItems = bameiImiYuraiItems;
    }

    /**
     * @return kaisaiScheduleItems
     */
    public List<FormatRow> getKaisaiScheduleItems() {
        return kaisaiScheduleItems;
    }

    /**
     * @param kaisaiScheduleItems セットする kaisaiScheduleItems
     */
    @HorizontalRecords(tableLabel = "２５．開催スケジュール", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setKaisaiScheduleItems(List<FormatRow> kaisaiScheduleItems) {
        this.kaisaiScheduleItems = kaisaiScheduleItems;
    }

    /**
     * @return keitoInfoItems
     */
    public List<FormatRow> getKeitoInfoItems() {
        return keitoInfoItems;
    }

    /**
     * @param keitoInfoItems セットする keitoInfoItems
     */
    @HorizontalRecords(tableLabel = "２６．系統情報", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setKeitoInfoItems(List<FormatRow> keitoInfoItems) {
        this.keitoInfoItems = keitoInfoItems;
    }

    /**
     * @return courseInfoItems
     */
    public List<FormatRow> getCourseInfoItems() {
        return courseInfoItems;
    }

    /**
     * @param courseInfoItems セットする courseInfoItems
     */
    @HorizontalRecords(tableLabel = "２７．コース情報", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setCourseInfoItems(List<FormatRow> courseInfoItems) {
        this.courseInfoItems = courseInfoItems;
    }

    /**
     * @return dataMiningYosoItems
     */
    public List<FormatRow> getDataMiningYosoItems() {
        return dataMiningYosoItems;
    }

    /**
     * @param dataMiningYosoItems セットする dataMiningYosoItems
     */
    @HorizontalRecords(tableLabel = "１０１．データマイニング予想", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setDataMiningYosoItems(List<FormatRow> dataMiningYosoItems) {
        this.dataMiningYosoItems = dataMiningYosoItems;
    }

    /**
     * @return bataizyuItems
     */
    public List<FormatRow> getBataizyuItems() {
        return bataizyuItems;
    }

    /**
     * @param bataizyuItems セットする bataizyuItems
     */
    @HorizontalRecords(tableLabel = "１０２．馬体重", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setBataizyuItems(List<FormatRow> bataizyuItems) {
        this.bataizyuItems = bataizyuItems;
    }

    /**
     * @return tenkoBabazyotaiItems
     */
    public List<FormatRow> getTenkoBabazyotaiItems() {
        return tenkoBabazyotaiItems;
    }

    /**
     * @param tenkoBabazyotaiItems セットする tenkoBabazyotaiItems
     */
    @HorizontalRecords(tableLabel = "１０３．天候馬場状態", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setTenkoBabazyotaiItems(List<FormatRow> tenkoBabazyotaiItems) {
        this.tenkoBabazyotaiItems = tenkoBabazyotaiItems;
    }

    /**
     * @return syussotorikeshiKyosozyogaiItems
     */
    public List<FormatRow> getSyussotorikeshiKyosozyogaiItems() {
        return syussotorikeshiKyosozyogaiItems;
    }

    /**
     * @param syussotorikeshiKyosozyogaiItems セットする syussotorikeshiKyosozyogaiItems
     */
    @HorizontalRecords(tableLabel = "１０４．出走取消・競走除外", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setSyussotorikeshiKyosozyogaiItems(List<FormatRow> syussotorikeshiKyosozyogaiItems) {
        this.syussotorikeshiKyosozyogaiItems = syussotorikeshiKyosozyogaiItems;
    }

    /**
     * @return kisyuHenkoItems
     */
    public List<FormatRow> getKisyuHenkoItems() {
        return kisyuHenkoItems;
    }

    /**
     * @param kisyuHenkoItems セットする kisyuHenkoItems
     */
    @HorizontalRecords(tableLabel = "１０５．騎手変更", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setKisyuHenkoItems(List<FormatRow> kisyuHenkoItems) {
        this.kisyuHenkoItems = kisyuHenkoItems;
    }

    /**
     * @return hassoJikokuHenkoItems
     */
    public List<FormatRow> getHassoJikokuHenkoItems() {
        return hassoJikokuHenkoItems;
    }

    /**
     * @param hassoJikokuHenkoItems セットする hassoJikokuHenkoItems
     */
    @HorizontalRecords(tableLabel = "１０６．発走時刻変更", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setHassoJikokuHenkoItems(List<FormatRow> hassoJikokuHenkoItems) {
        this.hassoJikokuHenkoItems = hassoJikokuHenkoItems;
    }

    /**
     * @return courseHenkoItems
     */
    public List<FormatRow> getCourseHenkoItems() {
        return courseHenkoItems;
    }

    /**
     * @param courseHenkoItems セットする courseHenkoItems
     */
    @HorizontalRecords(tableLabel = "１０７．コース変更", recordClass = FormatRow.class, terminal = RecordTerminal.Border)
    public void setCourseHenkoItems(List<FormatRow> courseHenkoItems) {
        this.courseHenkoItems = courseHenkoItems;
    }
    
}
