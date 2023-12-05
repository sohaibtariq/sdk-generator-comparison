/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for LobConfidenceScore type.
 */
public class LobConfidenceScore {
    private Double score;
    private LevelEnum level;

    /**
     * Default constructor.
     */
    public LobConfidenceScore() {
    }

    /**
     * Initialization constructor.
     * @param  score  Double value for score.
     * @param  level  LevelEnum value for level.
     */
    public LobConfidenceScore(
            Double score,
            LevelEnum level) {
        this.score = score;
        this.level = level;
    }

    /**
     * Getter for Score.
     * A numerical score between 0 and 100 that represents the percentage of mailpieces Lob has sent
     * to this addresses that have been delivered successfully over the past 2 years. Will be `null`
     * if no tracking data exists for this address.
     * @return Returns the Double
     */
    @JsonGetter("score")
    public Double getScore() {
        return score;
    }

    /**
     * Setter for Score.
     * A numerical score between 0 and 100 that represents the percentage of mailpieces Lob has sent
     * to this addresses that have been delivered successfully over the past 2 years. Will be `null`
     * if no tracking data exists for this address.
     * @param score Value for Double
     */
    @JsonSetter("score")
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * Getter for Level.
     * Indicates the likelihood that the address is a valid, mail-receiving address. Possible values
     * are: - `high` — Over 70% of mailpieces Lob has sent to this address were delivered
     * successfully and recent mailings were also successful. - `medium` — Between 40% and 70% of
     * mailpieces Lob has sent to this address were delivered successfully. - `low` — Less than 40%
     * of mailpieces Lob has sent to this address were delivered successfully and recent mailings
     * weren't successful. - `""` — No tracking data exists for this address or lob deliverability
     * was unable to find a corresponding level of mail success.
     * @return Returns the LevelEnum
     */
    @JsonGetter("level")
    public LevelEnum getLevel() {
        return level;
    }

    /**
     * Setter for Level.
     * Indicates the likelihood that the address is a valid, mail-receiving address. Possible values
     * are: - `high` — Over 70% of mailpieces Lob has sent to this address were delivered
     * successfully and recent mailings were also successful. - `medium` — Between 40% and 70% of
     * mailpieces Lob has sent to this address were delivered successfully. - `low` — Less than 40%
     * of mailpieces Lob has sent to this address were delivered successfully and recent mailings
     * weren't successful. - `""` — No tracking data exists for this address or lob deliverability
     * was unable to find a corresponding level of mail success.
     * @param level Value for LevelEnum
     */
    @JsonSetter("level")
    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    /**
     * Converts this LobConfidenceScore into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LobConfidenceScore [" + "score=" + score + ", level=" + level + "]";
    }

    /**
     * Builds a new {@link LobConfidenceScore.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link LobConfidenceScore.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(score, level);
        return builder;
    }

    /**
     * Class to build instances of {@link LobConfidenceScore}.
     */
    public static class Builder {
        private Double score;
        private LevelEnum level;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  score  Double value for score.
         * @param  level  LevelEnum value for level.
         */
        public Builder(Double score, LevelEnum level) {
            this.score = score;
            this.level = level;
        }

        /**
         * Setter for score.
         * @param  score  Double value for score.
         * @return Builder
         */
        public Builder score(Double score) {
            this.score = score;
            return this;
        }

        /**
         * Setter for level.
         * @param  level  LevelEnum value for level.
         * @return Builder
         */
        public Builder level(LevelEnum level) {
            this.level = level;
            return this;
        }

        /**
         * Builds a new {@link LobConfidenceScore} object using the set fields.
         * @return {@link LobConfidenceScore}
         */
        public LobConfidenceScore build() {
            return new LobConfidenceScore(score, level);
        }
    }
}
